package com.gra.controller;


import com.gra.pojo.User;
import com.gra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLoginPage")             //跳转至登录页面
    public String toLoginPage(){ return "loginPage"; }

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword, Model model){
        System.out.println(userName);
        User user = userService.queryByUserName(userName);
        if(user == null){
            model.addAttribute("userLoginInfo","用户名不存在");
            return "loginPage";
        }else {
            if(!user.getUserPassword().equals(userPassword)){
                model.addAttribute("userLoginInfo","密码错误");
                return "loginPage";
            }else {
                return "Main";
            }
        }
    }
}
