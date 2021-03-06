package com.example.mvvm_01.data

class FakeDataBase private constructor(){
    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile private var instance: FakeDataBase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDataBase().also { instance = it }
            }
    }

}
