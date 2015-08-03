package cn.hotwoo.alien.minisns.app;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by alien on 2015/8/2.
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
