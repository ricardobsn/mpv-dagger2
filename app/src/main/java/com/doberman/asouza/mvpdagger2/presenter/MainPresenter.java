package com.doberman.asouza.mvpdagger2.presenter;

import com.doberman.asouza.mvpdagger2.contract.MainContract;

import java.util.concurrent.Callable;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by asouza on 10/09/16.
 */
public class MainPresenter implements MainContract.Presenter.MainPresenter {

    private MainContract.View.MainView mainView = null;
    private MainContract.View.SimpleView simpleView = null;
    private MainContract.View.DetailedView detailedView = null;

    @Inject
    MainPresenter(){

    }

    @Override
    public void attachMainView(MainContract.View.MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void attachSimpleView(MainContract.View.SimpleView simpleView) {
        this.simpleView = simpleView;
    }

    @Override
    public void attachDetailedView(MainContract.View.DetailedView detailedView) {
        this.detailedView = detailedView;
    }

    @Override
    public void loadStarterData() {

    }

    @Override
    public void loadMoreData() {

    }

}
