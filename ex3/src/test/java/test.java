import com.kang.config.SpringConfig;
import com.kang.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class test {
    @Resource(name = "studentService")
    private StudentService studentService;
    @Test
    public void test1(){
        studentService.save();
    }
}
