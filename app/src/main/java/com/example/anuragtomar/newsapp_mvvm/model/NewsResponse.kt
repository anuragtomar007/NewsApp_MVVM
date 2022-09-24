package com.example.anuragtomar.newsapp_mvvm.model

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)