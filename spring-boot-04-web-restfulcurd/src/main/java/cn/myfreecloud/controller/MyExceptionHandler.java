package cn.myfreecloud.controller;

import cn.myfreecloud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyang
 * 异常处理器
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 用来标注处理什么异常
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //传入我们自己的错误状态码 5xx

        //传入我们自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notexist");
        map.put("message","用户出错啦");

        request.setAttribute("ext",map);
        //转发到/error 网页版和移动版自适应效果
        return "forward:/error";
    }
}
