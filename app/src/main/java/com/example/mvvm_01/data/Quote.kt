package com.example.mvvm_01.data

class Quote (val quoteText: String, val author: String)
{
    override fun toString(): String
    {
    return "$quoteText - $author"
    }
}