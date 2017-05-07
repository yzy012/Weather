package com.yzy.weather.gson;

/**
 * Created by yezhiying on 2017/5/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
