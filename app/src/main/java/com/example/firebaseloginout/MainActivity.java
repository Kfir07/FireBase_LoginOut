package com.example.firebaseloginout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText gmail, password;
    Button send;
    String mail, pass;
    FirebaseHandler FBH = new FirebaseHandler(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gmail = (EditText) findViewById(R.id.gmail);
        password = (EditText) findViewById(R.id.password);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail = gmail.getText().toString();
                pass = password.getText().toString();
                FBH.registerWithEmailAndPassword(mail, pass);
            }
        });
    }
}