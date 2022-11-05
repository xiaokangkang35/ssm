import com.kang.biz.StudentBiz;
import com.kang.config.MyConfiguration;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = MyConfiguration.class)
public class Test {
//    @Autowired
//    @Qualifier("studentBizImpl")
    @Resource(name = "studentBizImpl")
    private StudentBiz studentBiz;
    @Autowired
    private Date date;

    @org.junit.Test
    public void test1(){
        studentBiz.save();
        System.out.println(date);
    }
}
