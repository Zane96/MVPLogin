package com.example.zane.mvplogin.activities;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.zane.mvplogin.activities.model.bean.User;
import com.example.zane.mvplogin.activities.vus.LoginActivityViewImpl;
import com.example.zane.mvplogin.activities.vus.VuLoginActivity;

public class MainActivity extends BasePresentActivity<LoginActivityViewImpl, VuLoginActivity> {

    @Override
    protected void onBindVu() {

        final User user = new User();

        vu.getButtonLogin().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = vu.getEditTextAccount().getText().toString();
                String password = vu.getEditTextPassword().getText().toString();
                Toast.makeText(MainActivity.this, userName, Toast.LENGTH_SHORT).show();
                if(userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
                    Intent intent = new Intent(MainActivity.this, LoginSuccessActivity.class);
                    intent.putExtra("username", userName);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "错误", Toast.LENGTH_SHORT).show();
                }
            }
        });

        vu.getButtonClear().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vu.clearText();
            }
        });
    }

    @Override
    protected void onDestroyVu() {
        super.onDestroyVu();
    }

    @Override
    protected Class<LoginActivityViewImpl> getVuClass() {
        return LoginActivityViewImpl.class;
    }
}
