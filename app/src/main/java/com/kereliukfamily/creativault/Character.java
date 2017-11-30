package com.kereliukfamily.creativault;

/**
 * Created by skereliuk6174 on 11/22/2017.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "trophy",
        foreignKeys = {
                @ForeignKey(
                        entity = User.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = ForeignKey.CASCADE
                )},
        indices = { @Index(value = "id")}
)
public class Character {
    @PrimaryKey(autoGenerate = true)
    long id;

    public long userId;

    String description;

    public Character(long userId, String description) {
        this.userId = userId;
        this.description = description;
    }
}
