package com.jameswong.codediary;

/**
 * ****************************************************
 * author: JamesWong
 * created on: 2017年07月13日  16:00
 * e-mail: PassionateWsj@outlook.com
 * name:
 * desc:
 * ****************************************************
 */

interface OnDataResultListener {
    void onResultSuccess(WeatherBean weatherBean);

    void onResultFailure();
}
