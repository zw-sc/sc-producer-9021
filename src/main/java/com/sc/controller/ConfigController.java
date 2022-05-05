package com.sc.controller;

import com.sc.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${mysql.url}")
    private String mysqlUrl;

    @GetMapping("/url")
    public String findDefaultResumeState() {
        System.out.println("====>>>>>>>>>>>>>>我是9021，config访问到我这里了......");
        return mysqlUrl;
    }
}
