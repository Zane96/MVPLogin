package com.example.zane.mvplogin.activities.vus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zane on 15/12/5.
 * view类的超类
 */
public interface Vu {
    void init(LayoutInflater inflater, ViewGroup container);
    View getView();
}
