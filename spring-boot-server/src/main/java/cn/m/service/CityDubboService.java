package cn.m.service;

import cn.m.entity.City;

public interface CityDubboService {

    public City findCityByName(String cityName);
}
