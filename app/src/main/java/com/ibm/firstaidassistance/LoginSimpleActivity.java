package com.ibm.firstaidassistance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LoginSimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_simple);
        addListenerOnButton();

    }

    Button button;
    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.validateLoginSimpleButton);

        button.setOnClickListener(new View.OnClickListener() {

            public int emailLoginSimpleInput;

            @Override
            public void onClick(View myView) {

                // Check des champs
                String myEmail = findViewById(R.id.emailLoginSimpleInput).toString();
                if(myEmail.isEmpty()){
                    // Implémenter message d'erreur
                }

                String myPassword = findViewById(R.id.passwordLoginSimpleInput).toString();
                if(myPassword.isEmpty()){
                    // Implémenter message d'erreur
                }

                int myChoice = R.id.signInOrRegisterLoginSimpleInput;
                if(myChoice == 0){
                    // Implémenter la connexion de l'utilisateur

                }else{
                    // Implémenter l'enregistrement de l'utilisateur

                }

                // Implémenter : Lancer la page suivante selon le choix

            }

        });

    }


}
