package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val quotesRepository: QuotesRepository):ViewModel() {

    fun getQuotes():LiveData<List<Quotes>>{
        return quotesRepository.getQuotes()
    }

    fun insetQuotes(quotes: Quotes){

        viewModelScope.launch(Dispatchers.IO) {
            quotesRepository.insetQuote(quotes)

        }

    }

}