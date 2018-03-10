package com.example.vipulagarwal.vantutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    String Score,Item2;
    TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);
        Button b1 = (Button) findViewById(R.id.button);

//        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();
//        Score = extras.getString("score");

        Bundle bundle=getIntent().getExtras();
        String total=bundle.getString("score1");
        int total1=Integer.parseInt(total);
        if(total1 < 3)
            Item2 = "YOU HAVE FAILED";
        else
            Item2 = "YOU HAVE PASSED";
        tv.setText("Your score is "+total+" Out of 5");
        tv2.setText(Item2);
    }

    public void onClick(View view) {
        Toast.makeText(Result.this,"Taking Retest",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Result.this, JavaTest.class);
        startActivity(intent);
    }
    public void onHome(View v)
    {
        Toast.makeText(Result.this,"Going Home",Toast.LENGTH_LONG).show();
        Intent i=new Intent(Result.this,SubjectSelect.class);
        startActivity(i);
    }
}
