package com.carvin.tmall.exception;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@ControllerAdvice
public class GloabalExceptionHandler{
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req,Exception e)throws Exception{
        e.printStackTrace();
        Class c = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if (null!=e.getCause()&&c==e.getCause().getClass()){
            return "constrainViolationException";
        }
        return e.getMessage();
    }
}
