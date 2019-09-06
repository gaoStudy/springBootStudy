package com.gaodev.springbootstudy.Controller;

import com.gaodev.springbootstudy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 个人主页
 */
@RestController
//@RestController 这个注解相当于同时添加@Controller和@ResponseBody注解

@RequestMapping(value = "v1/user")
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/index")
    public String index() {
        return "index/index";
    }


    @RequestMapping(value = "/list")
    public String userList() {

        return "";
    }

}
