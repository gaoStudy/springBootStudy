package com.gaodev.springbootstudy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户中心
 */
//@Controller
@RestController
@RequestMapping(value = "members")
public class MembersControllor {

    @GetMapping(value = "/index")
    public String index(){
        return "用户中心";
    }

}
