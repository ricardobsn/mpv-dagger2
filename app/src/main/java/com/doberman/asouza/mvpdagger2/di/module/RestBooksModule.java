package com.doberman.asouza.mvpdagger2.di.module;

import com.doberman.asouza.mvpdagger2.contract.MainContract;
import com.doberman.asouza.mvpdagger2.model.contract.BookRestContract;
import com.doberman.asouza.mvpdagger2.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asouza on 10/09/16.
 */
@Module
public class RestBooksModule {

    @Singleton
    @Provides
    public BookRestContract providerRestBooksModule() {
        Retrofit build = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://www.googleapis.com/books/v1/")
                .build();

        return build.create(BookRestContract.class);

    }


}
