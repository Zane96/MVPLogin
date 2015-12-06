package com.example.zane.mvplogin.activities;


import android.os.Bundle;
import com.example.zane.mvplogin.activities.vus.LoginSuccessActivityImpl;
import com.example.zane.mvplogin.activities.vus.VuLoginSuccessActivity;

/**
 * Created by Zane on 15/12/5.
 */
public class LoginSuccessActivity extends BasePresentActivity<LoginSuccessActivityImpl, VuLoginSuccessActivity> {

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userName = getIntent().getStringExtra("username");
    }

    @Override
    protected Class<LoginSuccessActivityImpl> getVuClass() {
        return LoginSuccessActivityImpl.class;
    }

    @Override
    protected void onBindVu() {
        vu.setText(userName);
    }

    @Override
    protected void onDestroyVu() {
        super.onDestroyVu();
    }


}
