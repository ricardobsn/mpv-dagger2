package com.doberman.asouza.mvpdagger2.di.contract;

import android.content.Context;

import com.doberman.asouza.mvpdagger2.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by asouza on 10/09/16.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context provideContext();

}
