package com.example.torikul192002131;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText user,pass;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//       Refarancing

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        submit = findViewById(R.id.submit);

        // event listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                Toast.makeText(getApplicationContext(),username, Toast.LENGTH_SHORT).show();


            }
        });




    }



}