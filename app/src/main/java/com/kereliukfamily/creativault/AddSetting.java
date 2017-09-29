package com.kereliukfamily.creativault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddSetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_setting);
    }

    public void goToSettingList(View v)
    {
        Intent settingListIntent = new Intent(this ,SettingList.class);
        startActivity(settingListIntent);
    }
}
