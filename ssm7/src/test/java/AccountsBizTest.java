import com.kang.biz.AccountsBiz;
import com.kang.config.MyConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = MyConfiguration.class)
public class AccountsBizTest {
    @Autowired
    private AccountsBiz accountsBiz;
    @Test
    public void test(){
        accountsBiz.transfer("a","b",1000);
    }
}
