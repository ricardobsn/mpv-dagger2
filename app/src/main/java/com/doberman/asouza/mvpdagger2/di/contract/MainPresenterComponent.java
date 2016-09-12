package com.doberman.asouza.mvpdagger2.di.contract;

import android.app.Application;
import android.app.Service;
import android.content.Context;

import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.BookServiceModule;
import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;
import com.doberman.asouza.mvpdagger2.di.module.NetModule;
import com.doberman.asouza.mvpdagger2.di.scope.ScopeActivity;
import com.doberman.asouza.mvpdagger2.model.service.BookService;
import com.doberman.asouza.mvpdagger2.view.MainActivity;
import com.doberman.asouza.mvpdagger2.view.fragment.DetailedFragment;
import com.doberman.asouza.mvpdagger2.view.fragment.SimpleFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by asouza on 10/09/16.
 */
@Singleton
@Component(dependencies = BookServiceComponent.class,modules = {MainPresenterModule.class, AppModule.class})
public interface MainPresenterComponent{

    void inject(MainActivity activity);

    void inject(DetailedFragment fragment);

    void inject(SimpleFragment fragment);

}