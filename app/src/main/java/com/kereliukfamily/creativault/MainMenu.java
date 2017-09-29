package com.kereliukfamily.creativault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void goToSetting(View v)
    {
        Intent settingListIntent = new Intent(this ,SettingList.class);
        startActivity(settingListIntent);
    }

    public void goToCharacter(View v)
    {
        Intent characterListIntent = new Intent(this ,CharacterList.class);
        startActivity(characterListIntent);
    }
}
