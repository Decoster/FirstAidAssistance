package com.ibm.firstaidassistance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Context;

/**
 * screen with button for calling help
 * @autor aascone
 */
public class callHelpActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_help);

        addListenerOnButton();

        TelephonyManager tm= (TelephonyManager) getSystemService(Context.TELECOM_SERVICE);

    }


    Button button;
    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.button_save);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent AppelSOS =
                        new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3624"));
                startActivity(AppelSOS);

            }

        });

    }


}
