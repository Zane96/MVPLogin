package com.example.zane.mvplogin.activities.vus;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Zane on 15/12/5.
 * 为了使view类和present类解藕
 */
public interface VuLoginActivity extends Vu{

    Button getButtonLogin();

    Button getButtonClear();

    EditText getEditTextAccount();

    EditText getEditTextPassword();

    void clearText();

}
