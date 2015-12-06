package com.example.zane.mvplogin.activities.vus;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.example.zane.mvplogin.R;

/**
 * Created by Zane on 15/12/5.
 */
public class LoginActivityViewImpl implements VuLoginActivity{

    protected View view;
    protected Button buttonLogin;
    protected Button buttonClear;
    protected EditText account;
    protected EditText password;

    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.activity_main, container, false);
        buttonLogin = (Button)view.findViewById(R.id.button_login);
        buttonClear = (Button)view.findViewById(R.id.button_clear);
        account = (EditText)view.findViewById(R.id.account);
        password = (EditText)view.findViewById(R.id.password);
    }

    @Override
    public View getView() {
        return view;
    }

    @Override
    public Button getButtonLogin() {
        return buttonLogin;
    }

    @Override
    public Button getButtonClear() {
        return buttonClear;
    }

    @Override
    public EditText getEditTextAccount() {
        Log.i("1", account.getText().toString());

        return account;
    }

    @Override
    public EditText getEditTextPassword() {
        return password;
    }

    @Override
    public void clearText() {
        account.setText("");
        password.setText("");
    }
}
