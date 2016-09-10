package com.doberman.asouza.mvpdagger2.presenter;

import com.doberman.asouza.mvpdagger2.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by asouza on 10/09/16.
 */
public class MainPresenter implements MainContract.Presenter.MainPresenter {

    @Inject
    MainPresenter(){

    }

    @Override
    public void attachMainView(MainContract.View.MainView mainView) {

    }

    @Override
    public void attachSimpleView(MainContract.View.SimpleView simpleView) {

    }

    @Override
    public void attachDetailedView(MainContract.View.DetailedView detailedView) {

    }
}
