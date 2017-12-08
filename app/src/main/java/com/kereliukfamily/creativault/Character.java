package com.kereliukfamily.creativault;

/**
 * Created by skereliuk6174 on 11/22/2017.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "character",
        foreignKeys = {
                @ForeignKey(
                        entity = User.class,
                        parentColumns = "id",
                        childColumns = "userID",
                        onDelete = ForeignKey.CASCADE
                )},
        indices = { @Index(value = "id")}
)
public class Character {
    @PrimaryKey(autoGenerate = true)
    long characterID;

    public long userID;

    String name;
    double femMasc;
    double simpleComplex;
    double quietLoud;

    public Character(long userID, String name, double femMasc, double simpleComplex, double quietLoud) {
        this.userID = userID;
        this.name = name;
        this.femMasc = femMasc;
        this.simpleComplex = simpleComplex;
        this.quietLoud = quietLoud;
    }
}
