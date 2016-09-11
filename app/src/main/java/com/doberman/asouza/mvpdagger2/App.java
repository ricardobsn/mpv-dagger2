package com.doberman.asouza.mvpdagger2;

import android.app.Application;

import com.doberman.asouza.mvpdagger2.di.contract.AppComponent;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerAppComponent;
import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;

/**
 * Created by asouza on 10/09/16.
 */
public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .mainPresenterModule(new MainPresenterModule())
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

}
