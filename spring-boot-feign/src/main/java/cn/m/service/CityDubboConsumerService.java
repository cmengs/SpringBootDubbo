package cn.m.service;

import cn.m.entity.City;
import cn.m.entity.User;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

@Component
public class CityDubboConsumerService {

    @Reference
    CityDubboService cityDubboService;

    @Reference
    UserService userService;

    public void printCity() {
        String cityName = "广州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }


    public User saveUser() {
        User user = new User();
        user.setUserName("jaycekon");
        user.setPassword("11");
        return userService.saveUser(user);
    }
}
