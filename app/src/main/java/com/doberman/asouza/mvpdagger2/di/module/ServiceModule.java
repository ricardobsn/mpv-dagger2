package com.doberman.asouza.mvpdagger2.di.module;

import com.doberman.asouza.mvpdagger2.model.contract.ApiBookContract;
import com.doberman.asouza.mvpdagger2.model.service.BookService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by asouza on 12/09/16.
 */
@Module
public class ServiceModule {

    @Provides
    public ApiBookContract providerBookContract(Retrofit retrofit) {
        return retrofit.create(ApiBookContract.class);
    }

    @Provides
    public BookService provideBookService(ApiBookContract apiBookContract){
        return new BookService(apiBookContract);
    }

}
