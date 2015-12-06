package com.example.zane.mvplogin.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zane.mvplogin.activities.vus.Vu;

/**
 * Created by Zane on 15/12/5.
 * 用于抽出activity中对于ui的操作代码
 * 弄出两个抽象方法来保证生命周期同步
 */
public abstract class BasePresentActivity<X extends V, V extends Vu> extends AppCompatActivity{

    protected V vu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            vu = getVuClass().newInstance();
            vu.init(getLayoutInflater(), null);
            setContentView(vu.getView());
            onBindVu();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onDestroy() {
        onDestroyVu();
        vu = null;
        super.onDestroy();

    }

    protected abstract Class<X> getVuClass();

    protected void onBindVu(){};

    protected void onDestroyVu() {};
}
