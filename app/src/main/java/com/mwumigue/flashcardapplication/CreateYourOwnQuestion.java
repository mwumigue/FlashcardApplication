package com.mwumigue.flashcardapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateYourOwnQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_own_question);

        findViewById(R.id.cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateYourOwnQuestion.this, MainActivity.class);
                CreateYourOwnQuestion.this.startActivity(intent);
                overridePendingTransition(R.anim.cancel_button_in, R.anim.cancel_button_out);
            }
        });


        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = ((EditText) findViewById(R.id.user_question)).getText().toString();
                String answer = ((EditText) findViewById(R.id.user_answer)).getText().toString();
                Intent data = new Intent();
                data.putExtra("user_question", question);
                data.putExtra("user_answer", answer);
                setResult(RESULT_OK, data);
                finish();
                overridePendingTransition(R.anim.save_button_in, R.anim.save_button_out);
            }
        });


    }
}