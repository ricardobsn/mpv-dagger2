package com.doberman.asouza.mvpdagger2;

import android.app.Application;

import com.doberman.asouza.mvpdagger2.di.contract.BookServiceComponent;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerBookServiceComponent;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerMainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerNetComponent;
import com.doberman.asouza.mvpdagger2.di.contract.MainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.contract.NetComponent;
import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.BookServiceModule;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;
import com.doberman.asouza.mvpdagger2.di.module.NetModule;

/**
 * Created by asouza on 10/09/16.
 */
public class App extends Application {

    private MainPresenterComponent mainPresenterComponent;
    private BookServiceComponent bookServiceComponent;
    private NetComponent netComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        this.netComponent = DaggerNetComponent.builder()
                .netModule(new NetModule())
                .build();

        this.bookServiceComponent = DaggerBookServiceComponent.builder()
                .netComponent(netComponent)
                .bookServiceModule(new BookServiceModule())
                .build();

        this.mainPresenterComponent = DaggerMainPresenterComponent.builder()
                .bookServiceComponent(this.bookServiceComponent)
                .appModule(new AppModule(this))
                .mainPresenterModule(new MainPresenterModule())
                .build();
    }

    public MainPresenterComponent getMainPresenterComponent() {
        return mainPresenterComponent;
    }

}
