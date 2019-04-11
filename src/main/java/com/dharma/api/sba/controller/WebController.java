package com.dharma.api.sba.controller;

import com.dharma.api.sba.bean.Product;
import com.dharma.api.sba.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/web")
public class WebController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    ProductService productService;
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

    @RequestMapping("/product")
    public String product(ModelMap modelMap){
        List<Product> productList = productService.getProducts();
        modelMap.put("products",productList);
        return "products";
    }
}
