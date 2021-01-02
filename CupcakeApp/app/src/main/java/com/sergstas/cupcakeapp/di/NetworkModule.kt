package com.sergstas.cupcakeapp.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

/*@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    @Provides
    @Singleton*/
    /*fun*/ val provideMenuApi/*()*/: MenuApi = Retrofit.Builder()
        .baseUrl("http://192.168.0.3/")
        .client(OkHttpClient.Builder().addInterceptor { chain ->
            val request = chain.request().newBuilder()/*.addHeader()*/.build()
            chain.proceed(request)
        }.build())
        .addConverterFactory(Json{
            ignoreUnknownKeys = true
        }.asConverterFactory("application/json".toMediaType()))
        .build()
        .create()
/*}*/

