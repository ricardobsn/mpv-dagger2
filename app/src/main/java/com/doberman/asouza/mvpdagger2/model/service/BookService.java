package com.doberman.asouza.mvpdagger2.model.service;

import com.doberman.asouza.mvpdagger2.model.contract.BookContract;
import com.doberman.asouza.mvpdagger2.model.entity.Volumes;

import javax.inject.Inject;

/**
 * Created by asouza on 11/09/16.
 */
public class BookService {

    @Inject
    BookContract bookContract;

    @Inject
    BookService(){

    }
}
