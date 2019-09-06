package com.gaodev.springbootstudy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController 这个注解相当于同时添加@Controller和@ResponseBody注解
//@RestController
@RequestMapping(value = "login")
@Controller
public class AuthControllor {

//    @GetMapping("/"); // Annotations are not allowed here 不支持该写法
//    @GetMapping(value = "/index")
//    public String root(){
//        return "redirect:/index";
//    }

    @GetMapping(value = "/login")
    public String login(){
        return "login/login";
    }

    @RequestMapping(value = "/login-error")
    public String loginError(){
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        return "login";
    }
}
