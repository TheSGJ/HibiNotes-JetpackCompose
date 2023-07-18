package com.thesgjtech.hibi.feature_note.domain.repository

import kotlinx.coroutines.flow.Flow
import com.thesgjtech.hibi.feature_note.domain.model.Note

interface NoteRepository {
    fun getNotes(): Flow<List<Note>>
    suspend fun getNotes(id: Int): Note?
    suspend fun insertNotes(note: Note)
    suspend fun deleteNotes(note: Note)
}