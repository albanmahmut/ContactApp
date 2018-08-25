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
public class TestUserDAOUpdate {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        //TODO: the user details will be taken from Update User Profile Page
        User u=new User();
        u.setUserId(2);
        u.setName("Pasana Pasana");
        u.setPhone("5555555555");
        u.setEmail("pasana@pasana.com");
        u.setadress("Nonthaburi, TH");
        u.setRole(1);//Admin Role 
        u.setLoginStatus(1); //Active
        
        userDAO.update(u);
        System.out.println("--------Data Updated------");
    }    
}
