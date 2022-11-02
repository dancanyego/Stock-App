package com.example.stockapp.data.local

import androidx.room.Dao

@Dao

interface StockDao {
    suspend fun insertCompanyListings(
        comcompanyListingEntities: List<>
    )
}