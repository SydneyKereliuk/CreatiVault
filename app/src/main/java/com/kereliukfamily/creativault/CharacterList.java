package com.kereliukfamily.creativault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CharacterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);
    }

    public void goToAddCharacter(View v)
    {
        Intent addCharacterIntent = new Intent(this ,AddCharacter.class);
        startActivity(addCharacterIntent);
    }

    public void goToMainMenu(View v)
    {
        Intent mainMenuIntent = new Intent(this ,MainMenu.class);
        startActivity(mainMenuIntent);
    }
}
