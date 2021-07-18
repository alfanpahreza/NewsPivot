package com.team9.newspivot.api;

import com.team9.newspivot.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

            @Query("country") String country ,
            @Query("apiKey") String apiKey

    );

    @GET("top-headlines")
    Call<News> getNewsSearch(

        @Query("q") String keyword,
        @Query("country") String country ,
        @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<News> getNewsFiltered(

            @Query("country") String country ,
            @Query("category") String category ,
            @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<News> getNewsSearchFiltered(

            @Query("q") String keyword,
            @Query("country") String country ,
            @Query("category") String category ,
            @Query("apiKey") String apiKey
    );

    @GET("sources")
    Call<News> getSources(

            @Query("category") String category ,
            @Query("country") String country ,
            @Query("language") String language,
            @Query("apiKey") String apiKey
    );
    /*@GET("everything")
    Call<News> getNewsSearch(

            @Query("q") String keyword,
            //@Query("qlnTitle") String keyword, // klo mau di title doang
            @Query("language") String language,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey

    );*/
}
