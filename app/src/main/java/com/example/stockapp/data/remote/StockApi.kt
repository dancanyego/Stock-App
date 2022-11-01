package com.example.stockapp.data.remote

import retrofit2.http.Query

interface StockApi {
    suspend fun getListings(
        @Query("apiKey") apikey: String
    )

    companion object {
        const val API_KEY = "E3H3DN1PAWP2TD5C"
    }
}