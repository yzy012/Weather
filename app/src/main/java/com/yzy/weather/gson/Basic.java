package com.yzy.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yezhiying on 2017/5/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}