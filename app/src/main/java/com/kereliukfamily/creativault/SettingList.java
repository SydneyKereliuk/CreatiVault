package com.kereliukfamily.creativault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_list);
    }

    public void goToAddSetting(View v)
    {
        Intent addSettingIntent = new Intent(this,AddSetting.class);
        startActivity(addSettingIntent);
    }

    public void goToMainMenu(View v)
    {
        Intent mainMenuIntent = new Intent(this ,MainMenu.class);
        startActivity(mainMenuIntent);
    }
}
