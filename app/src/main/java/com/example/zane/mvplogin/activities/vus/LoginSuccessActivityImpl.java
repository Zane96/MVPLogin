package com.example.zane.mvplogin.activities.vus;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zane.mvplogin.R;

import org.w3c.dom.Text;

/**
 * Created by Zane on 15/12/5.
 */
public class LoginSuccessActivityImpl implements VuLoginSuccessActivity{

    public View view;
    private TextView textView;


    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.activity_loginsuccess_layout, container, false);
        textView = (TextView) view.findViewById(R.id.text);

    }

    @Override
    public View getView() {
        return view;
    }


    @Override
    public void setText(String s) {
        textView.setText(s);
    }
}
