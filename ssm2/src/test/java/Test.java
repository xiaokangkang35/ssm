import com.kang.biz.StudentBiz;
import com.kang.dao.StudentDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private StudentBiz studentBiz;

    @org.junit.Test
    public void test2(){
        studentBiz.save();
    }

    @org.junit.Test
    public void test1(){
        studentDao.save();
    }

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\HUAWEI\\Desktop\\java web demo\\Experiment2\\src\\main\\resources\\applicationContext.xml");
        context.getBean(StudentBiz.class).save();
//        ((ClassPathXmlApplicationContext)context).close();
        ((FileSystemXmlApplicationContext)context).close();
    }
}
