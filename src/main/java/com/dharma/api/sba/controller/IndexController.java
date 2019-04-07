package com.dharma.api.sba.controller;

import com.dharma.api.sba.bean.Admin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/index")

public class IndexController {
    @Value(value = "good afternoon")
    private  String greeting;

    @Value(value = "${dharma.randomInt}")
    private int build;

    @Value(value = "${dharma.randomString}")
    private String uuid;

    @Value(value = "${dharma.project}")
    private String project;

    @Value(value = "${dharma.noexist:default}")
    private String[] unknown;

    @Value(value = "${dharma.team}")
    private String[] team;

    @Value(value = "#{admin.name}")
    private String admin;

    @Bean
    public Admin admin(){
        return new Admin("pyy");
    }

    @GetMapping("/system")
    public HashMap<String, Object> sys(){
        HashMap<String,Object> sys = new HashMap<>();
        sys.put("project",project);
        sys.put("build",build);
        sys.put("uuid",uuid);
        sys.put("team",team);
        sys.put("admin",admin);
        sys.put("unknown",unknown);
        return sys;
    }


}
