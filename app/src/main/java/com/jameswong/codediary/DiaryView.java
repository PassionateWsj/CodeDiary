package com.jameswong.codediary;

/**
 * ****************************************************
 * author: JamesWong
 * created on: 2017年07月13日  15:54
 * e-mail: PassionateWsj@outlook.com
 * name:
 * desc:
 * ****************************************************
 */

public interface DiaryView {
    void onResultSuccess(WeatherBean weatherBean);

    void onResultFailure();
}
