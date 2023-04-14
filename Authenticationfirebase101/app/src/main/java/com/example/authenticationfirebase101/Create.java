
package com.example.authenticationfirebase101;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Create extends AppCompatActivity {
    private FirebaseAuth authentication;
    private EditText editEmail;
    private EditText editPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

       public void createUser(View view) {

        authentication = FirebaseAuth.getInstance();

           //Hent input fra textfelt
        editEmail = (EditText) findViewById(R.id.editTextTextPersonName);
        editPassword = (EditText) findViewById(R.id.editTextTextPersonName2);
        //Gem som string
        String email = editEmail.getText().toString();
        String password = editPassword.getText().toString();



        // Sæt ind i createUserWithEmailAndPassword

        authentication.createUserWithEmailAndPassword(email,password).onSuccessTask(new SuccessContinuation<AuthResult, Object>() {
            @NonNull
            @Override
            public Task<Object> then(AuthResult authResult) throws Exception {
                System.out.println("Task Successful");
                return null;
            }
        });
           //If der er succes - send brugeren videre vha Intent

        if(authentication.getCurrentUser() != null){
            //Toast.makeText(this, "User was succesfully created", Toast.LENGTH_SHORT).show();
            //Gør de brugerrelaterede ting
            //Intent intent = new Intent(Create.this, MembersOnly.class);
            //startActivity(intent);
        }
        else{
            //Toast.makeText(this, "User CANNOT be created", Toast.LENGTH_SHORT).show();
            //Send brugeren tilbage til login skærm
            //Intent intent = new Intent(Create.this, MainActivity.class);
            //startActivity(intent);
        }
    }

}
