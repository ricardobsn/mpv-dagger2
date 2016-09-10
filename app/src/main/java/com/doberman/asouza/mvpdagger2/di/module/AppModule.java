package com.doberman.asouza.mvpdagger2.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by asouza on 10/09/16.
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return application.getApplicationContext();
    }

}