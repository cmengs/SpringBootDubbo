package cn.m.controller;

import cn.m.service.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/jaycekon/SpringBoot
 * https://www.cnblogs.com/jaycekon/p/SpringBootDubbo.html
 */
@RestController
public class UserController {

    @Autowired
    private CityDubboConsumerService service;


    @RequestMapping("/save")
    public Object saveUser() {

        return service.saveUser();
    }
}
