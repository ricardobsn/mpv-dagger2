package com.doberman.asouza.mvpdagger2.di.contract;

import com.doberman.asouza.mvpdagger2.di.module.AppModule;
import com.doberman.asouza.mvpdagger2.di.module.BookServiceModule;
import com.doberman.asouza.mvpdagger2.di.module.NetModule;
import com.doberman.asouza.mvpdagger2.model.service.BookService;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by asouza on 11/09/16.
 */
@Component(dependencies = {NetComponent.class}, modules = {BookServiceModule.class})
public interface BookServiceComponent{

    void inject(BookService service);

    Retrofit retrofit();

}
