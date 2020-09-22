package com.example.howmany;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MyAPI{

    @POST("/surveys/")
    Call<PostItem> post_posts(@Body PostItem post);

    @PATCH("/surveys/{pk}/")
    Call<PostItem> patch_posts(@Path("pk") int pk, @Body PostItem post);

    @DELETE("/surveys/{pk}/")
    Call<PostItem> delete_posts(@Path("pk") int pk);

    @GET("/surveys/")
    Call<List<PostItem>> get_posts();

    @GET("/surveys/{pk}/")
    Call<PostItem> get_post_pk(@Path("pk") int pk);
}