package com.gaodev.springbootstudy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice
//@ResponseBody
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)

    public Map<String, Object> exceptionHandler() {
        Map<String, Object> result = new HashMap<>();

        result.put("code", 123);
        result.put("message", "系统错误");
        return result;
    }
}
