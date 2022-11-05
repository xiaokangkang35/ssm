import com.kang.config.MyConfiguration;
import com.kang.dao.StudentDao;
import com.kang.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyVetoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfiguration.class)
public class DBTest {
//    注解
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StudentDao studentDao;
    @Test
    public void test1(){
        Student s = new Student();
        s.setSname("kangkang");
        s.setAge(19);
        s.setStatus(1);
        System.out.println(studentDao.insert(s));
    }

    @Test
    public void test2(){
        Student s = new Student();
        s.setSname("ZhangSan");
        s.setAge(22);
        s.setStatus(1);
        s.setSid(1);
        System.out.println(studentDao.update(s));
    }

    @Test
    public void test3(){
        Student s = new Student();
        s.setSid(1);
        System.out.println(studentDao.delete(s));
    }

    @Test
    public void test4(){
        System.out.println(studentDao.findAllStudent());
    }

    @Test
    public void test5(){
        System.out.println(studentDao.findStudentById(4));
    }

    @Test
    public void testInsert(){
        int count = jdbcTemplate.update("insert into student values (null , ?, ?, ?);","ShuSi",23,0);
        System.out.println(count);
    }

    public static void main(String[] args) throws PropertyVetoException {
//        开始
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
//        dataSource.setUser("root");
//        dataSource.setPassword("123456");
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);

//        配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        int count = jdbcTemplate.update("insert into student values (null , ?, ?, ?);","WaKi",23,1);
        System.out.println(count);
    }
}
