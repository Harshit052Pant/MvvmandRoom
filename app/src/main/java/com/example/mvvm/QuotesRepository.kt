package com.example.mvvm

import androidx.lifecycle.LiveData

class QuotesRepository(val quoteDao: QuoteDao) {

    fun getQuotes():LiveData<List<Quotes>>{
        return quoteDao.getQuotes()

    }

    suspend fun insetQuote(quotes: Quotes){
        quoteDao.insetQuote(quotes)
    }

}