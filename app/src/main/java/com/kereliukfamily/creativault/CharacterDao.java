package com.kereliukfamily.creativault;

/**
 * Created by skereliuk6174 on 11/22/2017.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

public interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addCharacter(Character character);

    @Query("SELECT * FROM trophy WHERE userId=:userId")
    List<Character> findCharactersForUser(int userId);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateCharacter(Character haracter);

    @Query("delete from character where id = :id")
    void delete(long id);
}
