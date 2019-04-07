package com.dharma.api.sba.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class dharmaException {
    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException exception){
        ModelAndView m = new ModelAndView();
        m.addObject("dharmaException",exception);
        m.setViewName("error/500");
        return m;
    }
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception){
        ModelAndView m = new ModelAndView();
        m.addObject("exception",exception);
        m.setViewName("error/5xx");
        return m;
    }
}
