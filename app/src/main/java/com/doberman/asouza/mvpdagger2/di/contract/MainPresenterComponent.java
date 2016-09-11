package com.doberman.asouza.mvpdagger2.di.contract;

import com.doberman.asouza.mvpdagger2.di.module.MainPresenterModule;
import com.doberman.asouza.mvpdagger2.di.scope.ScopeActivity;
import com.doberman.asouza.mvpdagger2.view.MainActivity;
import com.doberman.asouza.mvpdagger2.view.fragment.DetailedFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by asouza on 10/09/16.
 */
@Singleton
@Component(modules = {MainPresenterModule.class})
public interface MainPresenterComponent{
}