package com.ibm.firstaidassistance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * Acitivity Setting d'un utilisateur.
 * @author jdecoster
 */
public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        addListenerOnButton();

    }




    Button button;
    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.button_save);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);

            }

        });

    }


}
