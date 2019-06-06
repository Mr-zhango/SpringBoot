package cn.myfreecloud.elastic;

import cn.myfreecloud.elastic.bean.Article;
import cn.myfreecloud.elastic.bean.Book;
import cn.myfreecloud.elastic.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot09ElasticApplicationTests {

    @Autowired
    JestClient jestClient;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
        //1、给Es中索引（保存）一个文档；
        Article article = new Article();
        //设置查询需要的id
        article.setId(1);
        article.setTitle("好消息");
        article.setAuthor("zhangsan");
        article.setContent("Hello World");

        //构建一个索引功能
        Index index = new Index.Builder(article).index("atguigu").type("news").build();

        try {
            //执行
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    //测试搜索
    @Test
    public void search(){

        //查询表达式--查询条件
        String json ="{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"content\" : \"hello\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        //更多操作：https://github.com/searchbox-io/Jest/tree/master/jest
        //指定索引和类型,为了搜索使用
        Search search = new Search.Builder(json).addIndex("atguigu").addType("news").build();

        //执行
        try {
            SearchResult result = jestClient.execute(search);
            System.out.println(result.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test02(){
		Book book = new Book();
		book.setId(1);
		book.setBookName("西游记");
		book.setAuthor("吴承恩");
		bookRepository.index(book);

        for (Book bookObj : bookRepository.findByBookNameLike("游")) {
            System.out.println(bookObj);
        }

    }



}
