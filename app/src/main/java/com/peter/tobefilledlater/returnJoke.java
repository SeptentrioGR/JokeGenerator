package com.peter.tobefilledlater;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class returnJoke extends AppCompatActivity {

    Button mButton;
    TextView mTextView;
    String randomJoke;
    JokeCatalogue jokesIknow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_joke);
        jokesIknow = new JokeCatalogue();
        mTextView = (TextView) findViewById(R.id.Title);
        mTextView.setText("Second Activity");

        Bundle extra = getIntent().getExtras();
        if(extra != null)
        {
            String jokeValue = extra.getString("KeyForSending");
            if(jokeValue!= null){
                Toast.makeText(this,jokeValue,Toast.LENGTH_SHORT);
            }
        }
        Intent returnIntent = new Intent();
        Joke joke = jokesIknow.sayRandomJoke();
        String jokeTitle = joke.getTitle();
        String jokeDesc = joke.getDesc();
        returnIntent.putExtra("jokeTitle",jokeTitle);
        returnIntent.putExtra("jokeDesc",jokeDesc);
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}

