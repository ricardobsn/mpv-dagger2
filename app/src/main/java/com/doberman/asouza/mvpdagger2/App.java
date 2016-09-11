package com.doberman.asouza.mvpdagger2;

import android.app.Application;

import com.doberman.asouza.mvpdagger2.di.contract.DaggerMainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.contract.MainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;

/**
 * Created by asouza on 10/09/16.
 */
public class App extends Application {

    private MainPresenterComponent mainPresenterComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        this.mainPresenterComponent = DaggerMainPresenterComponent.builder()
                .appModule(new AppModule(this))
                .mainPresenterModule(new MainPresenterModule())
                .build();
    }

    public MainPresenterComponent getMainPresenterComponent() {
        return mainPresenterComponent;
    }

}
