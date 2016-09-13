package com.doberman.asouza.mvpdagger2.di.contract;

import com.doberman.asouza.mvpdagger2.di.module.ServiceModule;
import com.doberman.asouza.mvpdagger2.model.contract.ApiBookContract;

import dagger.Component;

/**
 * Created by asouza on 12/09/16.
 */
@Component(modules = {ServiceModule.class}, dependencies = {NetComponent.class})
public interface ServiceComponent{
    ApiBookContract apiBookContract();
}
