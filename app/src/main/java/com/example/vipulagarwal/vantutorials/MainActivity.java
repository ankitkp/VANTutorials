package com.example.vipulagarwal.vantutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogin(View v)
    {
        EditText uname=(EditText)findViewById(R.id.editText);
        EditText pass=(EditText)findViewById(R.id.editText3);
        if (uname.getText().toString().length() == 0)
        {
            uname.setError("Username is required!");
        }
        else if (pass.getText().toString().length() == 0)
        {
            pass.setError("Password is required!");
        }
        else
        {
            if(uname.getText().toString().equals("user1")&&pass.getText().toString().equals("1234"))
            {
                Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,SubjectSelect.class);
                startActivity(i);
            }
            else
            {
                Toast.makeText(MainActivity.this,"Incorrect username or password",Toast.LENGTH_SHORT).show();
                uname.setText("");
                pass.setText("");
            }
        }
    }
}
