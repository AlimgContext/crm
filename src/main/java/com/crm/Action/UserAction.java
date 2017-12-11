package com.crm.Action;

import com.crm.Entity.User;
import com.crm.Service.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public String login(){
        User user = new User();
        user.setUsername("z");
        user.setPassword("zzz");

        User Reuser = userService.login(user);
        System.out.println(Reuser);
       if(Reuser != null){
           return "welcome";
       }else{
           return "login";
       }
    }
}
