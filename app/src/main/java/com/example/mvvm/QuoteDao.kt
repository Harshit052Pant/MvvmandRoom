package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDao {

    @Query("SELECT* FROM quote")
    fun getQuotes():LiveData<List<Quotes>>

    @Insert
    fun insetQuote(quotes: Quotes)


}