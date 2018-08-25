package com.malban.capp.test;

import com.malban.capp.config.SpringRootConfig;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author MAMI
 */
public class TestDataSource {  
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        JdbcTemplate jt = new JdbcTemplate(ds);
        String sql="INSERT INTO user(`name`, `phone`, `email`, `adress`, `loginName`, `password`) VALUES(?,?,?,?,?,?)";
        Object[] param = new Object[]{"mahmut", "987654321", "albanmahmut@gmail.com", "Nonthaburi", "admin", "a190384"};
        jt.update(sql, param);
        System.out.println("------SQL executed-----");
    }    
}
