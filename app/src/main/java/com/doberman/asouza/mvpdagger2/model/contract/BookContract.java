package com.doberman.asouza.mvpdagger2.model.contract;

import com.doberman.asouza.mvpdagger2.model.entity.Volumes;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by asouza on 10/09/16.
 */
public interface BookContract {
    @GET("volumes")
    public Observable<Volumes> searchBook(@Query("q") String query,@Query("startIndex") Integer startIndex);
}
