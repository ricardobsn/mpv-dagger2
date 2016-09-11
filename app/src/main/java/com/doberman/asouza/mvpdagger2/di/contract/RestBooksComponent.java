package com.doberman.asouza.mvpdagger2.di.contract;

import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.RestBooksModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by asouza on 11/09/16.
 */
@Singleton
@Component(modules = {RestBooksModule.class, AppModule.class})
public interface RestBooksComponent {
}
