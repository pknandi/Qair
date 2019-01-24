package com.example.jason.qair;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.RecursiveTask;

public class QuestionCreate extends Activity {

    private ImageButton questionCreate;
    private TextView QuestionNumber;
    private EditText questiontext,optionA,optionB,optionC,optionD,ChoiceOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_create);

        questionCreate = findViewById(R.id.question_button);
        QuestionNumber = findViewById(R.id.Question_number_view);
        questiontext = findViewById(R.id.Question_text);
        optionA = findViewById(R.id.OptionA);
        optionB = findViewById(R.id.OptionB);
        optionC = findViewById(R.id.OptionC);
        optionD = findViewById(R.id.OptionD);
        ChoiceOption = findViewById(R.id.OptionChoice);


        questionCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=QuestionNumber.getText().toString();
                int b = Integer.parseInt(a)+1;
                String optiona,optionb,optionc,optiond,optionchoice,questext;
                questext=questiontext.getText().toString();
                optiona=optionA.getText().toString();
                optionb=optionB.getText().toString();
                optionc=optionC.getText().toString();
                optiond=optionD.getText().toString();
                optionchoice=ChoiceOption.getText().toString();
                if(TextUtils.isEmpty(questext) || TextUtils.isEmpty(optiona) || TextUtils.isEmpty(optionb) || TextUtils.isEmpty(optionc) || TextUtils.isEmpty(optiond) || TextUtils.isEmpty(optionchoice)){
                    Toast.makeText(QuestionCreate.this,"Fill everything properly",Toast.LENGTH_LONG).show();
                    return;
                }
                QuestionNumber.setText(String.valueOf(b));
                questiontext.setText("");
                optionA.setText("");
                optionB.setText("");
                optionC.setText("");
                optionD.setText("");
                ChoiceOption.setText("");
                Toast.makeText(QuestionCreate.this,"Question Created",Toast.LENGTH_LONG).show();
            }
        });
    }
}
