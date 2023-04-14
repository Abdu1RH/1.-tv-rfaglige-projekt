package com.example.authenticationfirebase101;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    //private FirebaseAuth authentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        authentication = FirebaseAuth.getInstance();

        //Hent input fra textfelt
        //Gem som string
        //Sæt ind i createUserWithEmailAndPassword
        //If der er succes - send brugeren videre vha Intent

        authentication.createUserWithEmailAndPassword("asd@baba.com","kaka123").onSuccessTask(new SuccessContinuation<AuthResult, Object>() {
            @NonNull
            @Override
            public Task<Object> then(AuthResult authResult) throws Exception {
                System.out.println("Task Successful");
                return null;
            }
        });

        if(authentication.getCurrentUser() != null){
            //Gør de brugerrelaterede ting
        }
        else{
            //Send brugeren tilbage til login skærm
        }
    */
    }


    public void goToCreate (View view){
        Intent intent = new Intent(MainActivity.this, Create.class);
        startActivity(intent);
    }

    public void goToLogin (View view){
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }

}