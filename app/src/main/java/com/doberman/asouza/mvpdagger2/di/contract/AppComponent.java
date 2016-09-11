package com.doberman.asouza.mvpdagger2.di.contract;

import android.content.Context;

import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;
import com.doberman.asouza.mvpdagger2.di.module.RestBooksModule;
import com.doberman.asouza.mvpdagger2.view.MainActivity;
import com.doberman.asouza.mvpdagger2.view.fragment.DetailedFragment;
import com.doberman.asouza.mvpdagger2.view.fragment.SimpleFragment;

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
