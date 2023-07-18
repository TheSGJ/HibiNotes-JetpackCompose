package com.thesgjtech.hibi.feature_note.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import com.thesgjtech.hibi.feature_note.domain.model.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNotes(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes(note: Note)

    @Delete
    suspend fun deleteNotes(note: Note)
}