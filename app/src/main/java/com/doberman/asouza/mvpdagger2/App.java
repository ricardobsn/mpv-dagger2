package com.doberman.asouza.mvpdagger2;

import android.app.Application;

import com.doberman.asouza.mvpdagger2.di.contract.DaggerMainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerNetComponent;
import com.doberman.asouza.mvpdagger2.di.contract.DaggerServiceComponent;
import com.doberman.asouza.mvpdagger2.di.contract.MainPresenterComponent;
import com.doberman.asouza.mvpdagger2.di.contract.NetComponent;
import com.doberman.asouza.mvpdagger2.di.contract.ServiceComponent;
import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;
import com.doberman.asouza.mvpdagger2.di.module.NetModule;
import com.doberman.asouza.mvpdagger2.di.module.ServiceModule;

/**
 * Created by asouza on 10/09/16.
 */
public class App extends Application {

    private MainPresenterComponent mainPresenterComponent;
    private NetComponent netComponent;
    private ServiceComponent serviceComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        this.netComponent = DaggerNetComponent.builder()
                .netModule(new NetModule())
                .build();


        this.serviceComponent = DaggerServiceComponent.builder()
                .serviceModule(new ServiceModule())
                .netComponent(this.netComponent).build();

        this.mainPresenterComponent = DaggerMainPresenterComponent.builder()
                .appModule(new AppModule(this))
                .serviceComponent(this.serviceComponent)
                .mainPresenterModule(new MainPresenterModule())
                .build();
    }

    public MainPresenterComponent getMainPresenterComponent() {
        return mainPresenterComponent;
    }

}
