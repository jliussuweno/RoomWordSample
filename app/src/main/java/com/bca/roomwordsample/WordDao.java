package com.bca.roomwordsample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public abstract class WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract void insert(Word word);

    @Query("DELETE FROM word_table")
    abstract void deleteAll();

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    abstract LiveData<List<Word>> getAlphabetizedWords();
}
