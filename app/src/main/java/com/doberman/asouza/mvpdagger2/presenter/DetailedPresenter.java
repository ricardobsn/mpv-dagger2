package com.doberman.asouza.mvpdagger2.presenter;

import com.doberman.asouza.mvpdagger2.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by asouza on 10/09/16.
 */
public class DetailedPresenter implements MainContract.Presenter.DetailedPresenter {

    @Inject
    DetailedPresenter(){

    }

    @Override
    public void attachMainView(MainContract.View.MainView mainView) {

    }

    @Override
    public void attachView(MainContract.View.DetailedView detailedView) {

    }

    @Override
    public void notifyRequireMoreData() {

    }

    @Override
    public void waitLoadStarterData() {

    }

    @Override
    public void notDataFound() {

    }

}