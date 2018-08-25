package com.malban.capp.test;

import com.malban.capp.config.SpringRootConfig;
import com.malban.capp.dao.UserDAO;
import com.malban.capp.domain.User;
import com.malban.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author MAMI
 */
public class TestUserServiceRegister {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService=ctx.getBean(UserService.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("Tat");
        u.setPhone("44444444444");
        u.setEmail("tat@tat.com");
        u.setadress("Nonthaburi");
        u.setLoginName("tat");
        u.setPassword("tat123");
        u.setRole(UserService.ROLE_ADMIN);
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);
        userService.register(u);
        System.out.println("--------User Registered Successfully------");
    }    
}
