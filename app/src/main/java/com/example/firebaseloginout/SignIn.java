package com.example.firebaseloginout;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.FileInputStream;

public class SignIn extends AppCompatActivity {

    EditText gmail, password;
    String mail, pass;
    Button send;
    FirebaseHandler FBH= new FirebaseHandler(SignIn.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        gmail = (EditText) findViewById(R.id.gmail);
        password = (EditText) findViewById(R.id.password);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mail = gmail.getText().toString();
                pass = password.getText().toString();
                FBH.loginWithEmailAndPassword(mail, pass);
            }
        });
    }
}