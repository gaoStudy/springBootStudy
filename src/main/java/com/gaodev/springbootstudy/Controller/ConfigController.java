package com.gaodev.springbootstudy.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController 这个注解相当于同时添加@Controller和@ResponseBody注解
@RequestMapping(value = "/config")
public class ConfigController {
    @RequestMapping(value = "/index")
    public String index() {



        return "index/index";
    }
}
