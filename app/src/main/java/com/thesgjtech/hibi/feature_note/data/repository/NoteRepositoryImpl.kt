package com.thesgjtech.hibi.feature_note.data.repository

import com.thesgjtech.hibi.feature_note.data.data_source.NoteDao
import com.thesgjtech.hibi.feature_note.domain.model.Note
import com.thesgjtech.hibi.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override fun insertNote(note: Note){
        dao.insertNote(note)
    }

    override fun deleteNote(note: Note){
        dao.deleteNote(note)
    }
}