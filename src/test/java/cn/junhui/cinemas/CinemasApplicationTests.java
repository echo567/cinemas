package cn.junhui.cinemas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CinemasApplicationTests {


    @Autowired
    private DataSource dataSource;

    @Test
    public void getConnTest() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection conn = dataSource.getConnection();
        System.out.println(conn);

    }

    @Test
    public void rondom() {
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            String code = "";
            for (int i = 0; i < 6; i++) {
                code += random.nextInt(10);
            }
            System.out.println(code);
        }
    }
}

