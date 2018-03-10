package com.example.vipulagarwal.vantutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class JavaTest extends AppCompatActivity {
    private Button b1;
    private String answers[]= {"True","True","False","False","False"};
    private String result[] = new String[50];
    private int numberOfItems =0;

    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_test);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final RadioGroup radiogroup1 =  (RadioGroup) findViewById(R.id.myRadioGroup1);
        final  RadioGroup radiogroup2 =  (RadioGroup) findViewById(R.id.myRadioGroup2);
        final  RadioGroup radiogroup3 =  (RadioGroup) findViewById(R.id.myRadioGroup3);
        final  RadioGroup radiogroup4 =  (RadioGroup) findViewById(R.id.myRadioGroup4);
        final  RadioGroup radiogroup5 =  (RadioGroup) findViewById(R.id.myRadioGroup5);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId1 = radiogroup1.getCheckedRadioButtonId();
                RadioButton radioButton1 = (RadioButton) findViewById(selectedId1);
                result[numberOfItems++] = (radioButton1.getText().toString());

                int selectedId2 = radiogroup2.getCheckedRadioButtonId();
                RadioButton radioButton2 = (RadioButton) findViewById(selectedId2);
                result[numberOfItems++] = (radioButton2.getText().toString());

                int selectedId3 = radiogroup3.getCheckedRadioButtonId();
                RadioButton radioButton3 = (RadioButton) findViewById(selectedId3);
                result[numberOfItems++] = (radioButton3.getText().toString());


                int selectedId4 = radiogroup4.getCheckedRadioButtonId();
                RadioButton radioButton4 = (RadioButton) findViewById(selectedId4);
                result[numberOfItems++] = (radioButton4.getText().toString());


                int selectedId5 = radiogroup5.getCheckedRadioButtonId();
                RadioButton radioButton5 = (RadioButton) findViewById(selectedId5);
                result[numberOfItems++] = (radioButton5.getText().toString());

//                for (int i = 0; i < answers.length; i++)
//                {
//                    for (int j = 0; j < result.length; j++) {
//                        if (answers[i].equals(result[j])) {
//                            score++;
//                        }
//                    }
//                }

                if(result[0].equals("True"))
                    score++;
                if(result[1].equals("True"))
                    score++;
                if(result[2].equals("False"))
                    score++;
                if(result[0].equals("False"))
                    score++;
                if(result[0].equals("False"))
                    score++;

                Intent intent = new Intent(JavaTest.this, Result.class);
                Bundle extras=new Bundle();
                String total=String.valueOf(score);
                extras.putString("score1",total);
                intent.putExtras(extras);
                startActivity(intent);
//                if(score < 3)
//                    Toast.makeText(MainActivity.this,"FAIL", Toast.LENGTH_LONG).show();
//                else
//                    Toast.makeText(MainActivity.this,"Pass", Toast.LENGTH_LONG).show();
            }
        });
    }
}
