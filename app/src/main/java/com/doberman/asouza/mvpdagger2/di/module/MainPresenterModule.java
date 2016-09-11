package com.doberman.asouza.mvpdagger2.di.module;

import com.doberman.asouza.mvpdagger2.contract.MainContract;
import com.doberman.asouza.mvpdagger2.di.scope.ScopeActivity;
import com.doberman.asouza.mvpdagger2.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by asouza on 10/09/16.
 */
@Module
public class MainPresenterModule{

    @Singleton
    @Provides
    public MainContract.Presenter.MainPresenter providerMainPresenter(MainPresenter mainPresenter) {
        return mainPresenter;
    }

}