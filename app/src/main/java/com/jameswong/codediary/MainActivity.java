package com.jameswong.codediary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DiaryView{

    private TextView mTextView;
    private DiaryPresenter mDiaryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv_info);

        mDiaryPresenter = new DiaryPresenter(this);
        mDiaryPresenter.loadData();
    }

    @Override
    public void onResultSuccess(WeatherBean weatherBean) {
        mTextView.setText("");
        mTextView.append("日期："+weatherBean.getResult().getDate()+"\n");
        mTextView.append("星期："+weatherBean.getResult().getWeek()+"\n");
        mTextView.append("城市："+weatherBean.getResult().getCity()+"\n");
        mTextView.append("温度："+weatherBean.getResult().getTemp()+"°\n");
        mTextView.append("天气："+weatherBean.getResult().getWeather()+"\n");
    }

    @Override
    public void onResultFailure() {
        Toast.makeText(this, "网络错误", Toast.LENGTH_SHORT).show();
    }
}
