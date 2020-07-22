package cn.m.service;

import cn.m.entity.City;
import org.springframework.stereotype.Service;

@Service
public class CityDubboServiceImpl implements CityDubboService{

    @Override
    public City findCityByName(String cityName) {
        return new City(1L,2L,"广州","是我的故乡");
    }
}

