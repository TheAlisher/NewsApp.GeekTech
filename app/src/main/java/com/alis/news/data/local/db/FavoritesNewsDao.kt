package com.alis.news.data.local.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.alis.news.models.NewsArticles

@Dao
interface FavoritesNewsDao {

    @Insert
    fun insert(newsArticles: NewsArticles)

    @Delete
    fun delete(newsArticles: NewsArticles)

    @Query("SELECT * FROM newsArticles")
    fun getAll(): List<NewsArticles>?
}