package com.dharma.api.sba.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/web")
public class WebController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    @RequestMapping
    public String index(ModelMap map){
        logger.info("Web controller");
        map.put("title","FIRST BLOOD");
        return "index";
    }

    @RequestMapping("/error")
    public String error(){
        throw  new RuntimeException("no~");
    }
}
