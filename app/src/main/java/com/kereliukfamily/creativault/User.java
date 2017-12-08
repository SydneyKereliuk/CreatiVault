package com.kereliukfamily.creativault;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
/**
 * Created by skereliuk6174 on 11/22/2017.
 */

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    long userID;

    public String email;
    public String password;


    public User(long userID, String email, String password) {
        this.userID = userID;
        this.email = email;
        this.password = password;
    }
}
