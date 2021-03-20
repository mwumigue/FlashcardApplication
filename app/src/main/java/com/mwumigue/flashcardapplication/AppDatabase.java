package com.mwumigue.flashcardapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {com.mwumigue.flashcardapplication.Flashcard.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.mwumigue.flashcardapplication.FlashcardDao flashcardDao();
}
