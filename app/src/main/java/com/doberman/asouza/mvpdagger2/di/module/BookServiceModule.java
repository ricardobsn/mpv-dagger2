package com.doberman.asouza.mvpdagger2.di.module;

import com.doberman.asouza.mvpdagger2.model.contract.BookContract;
import com.doberman.asouza.mvpdagger2.model.entity.Volumes;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by asouza on 10/09/16.
 */
@Module
public class BookServiceModule{

    @Provides
    public BookContract providerBookServiceModule(Retrofit retrofit) {
        return retrofit.create(BookContract.class);
    }

}
