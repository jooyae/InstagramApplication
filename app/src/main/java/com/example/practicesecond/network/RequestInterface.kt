package com.example.practicesecond.network

import com.example.practicesecond.data.RequestLogin
import com.example.practicesecond.data.RequestRegister
import com.example.practicesecond.data.ResponseLogin
import com.example.practicesecond.data.ResponseRegister
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface{
    @POST("user/signin/")
    fun requestLogin(@Body body : RequestLogin) : Call<ResponseLogin>
    @POST("user/signup/")
    fun requestRegister(@Body body: RequestRegister) : Call<ResponseRegister>
}