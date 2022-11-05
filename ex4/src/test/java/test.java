import com.kang.dao.BookDao;
import com.kang.myconfig.MyConfiguration;
import com.kang.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfiguration.class)
public class test {

    @Autowired
    private BookDao bookDao;

    @Test
    public void test1(){
        Book book = new Book();
        book.setName("ai");
        book.setAuthor("zhangsan");
        book.setPrice(20);
        System.out.println(bookDao.insert(book));
    }

    @Test
    public void test2(){
        Book book = new Book();
        book.setName("ai");
        System.out.println(bookDao.delete(book));
    }

    @Test
    public void test3(){
        Book book = new Book();
        book.setName("lisi");
        book.setAuthor("wangwu");
        book.setPrice(200);
        book.setName("ai");
        System.out.println(bookDao.update(book));
    }

    @Test
    public void test4(){
        System.out.println(bookDao.findAllBook());
    }

}
