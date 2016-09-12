package com.doberman.asouza.mvpdagger2.di.contract;

import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by asouza on 11/09/16.
 */
@Component(modules = {NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
