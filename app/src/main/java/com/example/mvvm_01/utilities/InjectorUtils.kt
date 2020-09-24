package com.example.mvvm_01.utilities

import com.example.mvvm_01.data.FakeDataBase
import com.example.mvvm_01.data.QuoteRepository
import com.example.mvvm_01.ui.quotes.QuotesViewModelFactory

object InjectorUtils
{
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDataBase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}