package com.gaodev.springbootstudy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestController 这个注解相当于同时添加@Controller和@ResponseBody注解
//@RestController
//@ResponseBody
@Controller
/**
 * 首页
 */
public class IndexControllor {

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request, HttpServletResponse response){

        return "index/index";
    }
}
