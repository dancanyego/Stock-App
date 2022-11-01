package com.example.stockapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {
    @GET("query?functions=LISTING_STATUS")
    suspend fun getListings(
        @Query("apiKey") apikey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "E3H3DN1PAWP2TD5C"
        const val   BASE_URL = "https://www.alphavantage.co/"
    }
}