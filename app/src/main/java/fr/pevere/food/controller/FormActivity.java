package fr.pevere.food.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fr.pevere.food.R;

public class FormActivity extends AppCompatActivity {


    private TextView mTitleTextView;
    private TextView mQuestionWhenTextView;
    private TextView mQuestionWhatTextView;
    private TextView mQuestionHowMuchTextView;
    private EditText mQuestionWhenText;
    private EditText mQuestionWhatText;
    private EditText mQuestionHowMuchText;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mTitleTextView = findViewById(R.id.game_activity_textview_question);
        mQuestionWhenTextView = findViewById(R.id.game_activity_textview_question2);
        mQuestionWhatTextView = findViewById(R.id.game_activity_textview_question3);
        mQuestionHowMuchTextView = findViewById(R.id.game_activity_textview_question4);
    }
}