package cn.myfreecloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * @author: zhangyang
 * @date: 2019/6/13 10:22
 * @description:
 */
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @GetMapping(value = "/findAbwpWorkPlanByIdForExcelTemplate")
    @ResponseStatus(HttpStatus.OK)
    public HttpServletResponse findAbwpWorkPlanByIdForExcelTemplate(
            HttpServletResponse response) throws Exception {
        String fileName = "年度计划模板.xlsx";
        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");
        //设置要下载的文件的名称
        response.setHeader("Content-Disposition", "attachment;filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));
        //通知客服文件的MIME类型
        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        //获取文件的路径
        File fileObjectPath = new File(ResourceUtils.getURL("/src/main/resources/doc").getPath());

        try (FileInputStream input = new FileInputStream(new File(fileObjectPath +"/"+ fileName));
             OutputStream out = response.getOutputStream()){
            byte[] b = new byte[2048];
            int len;
            while ((len = input.read(b)) != -1) {
                out.write(b, 0, len);
            }

            response.setHeader("Content-Length", String.valueOf(input.getChannel().size()));
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return response;
    }

}
