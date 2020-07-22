package cn.m.service;

import cn.m.entity.City;

public interface CityDubboService {

    City findCityByName(String cityName);
}
