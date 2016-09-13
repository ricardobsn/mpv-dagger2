package com.doberman.asouza.mvpdagger2.model.service;

import com.doberman.asouza.mvpdagger2.model.contract.ApiBookContract;
import com.doberman.asouza.mvpdagger2.model.entity.Volumes;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by asouza on 11/09/16.
 */
public class BookService {

    private ApiBookContract apiBookContract;

    @Inject
    public BookService(ApiBookContract apiBookContract) {
        this.apiBookContract = apiBookContract;
    }

    public Observable<Volumes> searchBook(String query, Integer startIndex) {
        return this.apiBookContract.searchBook(query, startIndex);
    }

}
