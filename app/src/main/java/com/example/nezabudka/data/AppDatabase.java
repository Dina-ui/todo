package com.example.nezabudka.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.nezabudka.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}