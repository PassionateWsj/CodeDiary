package com.jameswong.codediary;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;

/**
 * ****************************************************
 * author: JamesWong
 * created on: 2017年07月13日  15:59
 * e-mail: PassionateWsj@outlook.com
 * name:
 * desc:
 * ****************************************************
 */

public class DiaryImpl implements DiaryModel {
    @Override
    public void loadData(final OnDataResultListener onDataResultListener) {
        OKHttpUtils.newInstance().getAsyncData(String.format(Constant.WEATHER,"上海",Constant.APP_KEY), new OKHttpUtils.OnReusltListener() {
            @Override
            public void onFailure(Call call, IOException e) {
                onDataResultListener.onResultFailure();
            }

            @Override
            public void onSucces(Call call, String response) {
                WeatherBean weatherBean = new Gson().fromJson(response, WeatherBean.class);
                onDataResultListener.onResultSuccess(weatherBean);
            }
        });
    }
}
