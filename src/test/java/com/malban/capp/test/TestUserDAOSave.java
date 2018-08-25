package com.malban.capp.test;

import com.malban.capp.config.SpringRootConfig;
import com.malban.capp.dao.UserDAO;
import com.malban.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author MAMI
 */
public class TestUserDAOSave {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("Pasana");
        u.setPhone("123456789");
        u.setEmail("pasana@pasana.com");
        u.setadress("Nonthaburi");
        u.setLoginName("pasana");
        u.setPassword("pasana123");
        u.setRole(1);//Admin Role 
        u.setLoginStatus(1); //Active
        userDAO.save(u);
        System.out.println("--------Data Saved------");
    }    
}
