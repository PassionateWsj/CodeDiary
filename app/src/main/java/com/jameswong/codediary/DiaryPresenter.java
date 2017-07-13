package com.jameswong.codediary;

/**
 * ****************************************************
 * author: JamesWong
 * created on: 2017年07月13日  15:57
 * e-mail: PassionateWsj@outlook.com
 * name:
 * desc:
 * ****************************************************
 */

public class DiaryPresenter {
    DiaryView diaryView;
    private final DiaryImpl mDiary;

    public DiaryPresenter(DiaryView diaryView) {
        this.diaryView = diaryView;
        mDiary = new DiaryImpl();
    }

    /**
     * 通知Model层加载数据
     */
    public void loadData() {
        mDiary.loadData(new OnDataResultListener() {
            @Override
            public void onResultSuccess(WeatherBean weatherBean) {
                diaryView.onResultSuccess(weatherBean);
            }

            @Override
            public void onResultFailure() {
                diaryView.onResultFailure();
            }
        });
    }
}
