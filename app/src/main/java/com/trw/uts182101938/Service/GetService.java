package com.trw.uts182101938.Service;

import com.trw.uts182101938.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUserList();
}
