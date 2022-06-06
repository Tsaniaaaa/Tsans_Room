package com.example.tsans_room.room

import android.provider.ContactsContract
import androidx.room.*
import com.example.tsans_room.room.Book

@Dao
interface BookDao {

    @Insert
    suspend fun addBook(book: Book)

    @Update
    suspend fun updateBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    @Query("SELECT * FROM book ORDER BY id DESC")
    suspend fun getBooks() : List<Book>

    @Query("SELECT * FROM book WHERE id=:book_Id")
    suspend fun getBook(book_Id: Int):List<Book>
}