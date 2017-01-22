package com.peter.tobefilledlater;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int DETAIL_REQUEST = 1;
    TextView appTitle;
    Button mButton = null;
    ProgressBar mLoadingIndicator;
    TextView jokeTitleText = null;
    TextView jokeDescText = null;
    LinearLayout jokeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokeLayout = (LinearLayout)findViewById(R.id.JokeLayout);
        appTitle = (TextView)findViewById(R.id.Title_Text);
        jokeTitleText = (TextView)findViewById(R.id.jokeTitle);
        jokeDescText = (TextView)findViewById(R.id.jokeDesc);
        mLoadingIndicator = (ProgressBar)findViewById(R.id.loading_indicator);
        mButton = (Button)findViewById(R.id.toSecondActivity);
        mButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               new GenerateJokeTask().execute();
           }
       });


    }

    public class GenerateJokeTask extends AsyncTask<Void,Void,Joke>{

        @Override
        protected void onPreExecute() {
            mLoadingIndicator.setVisibility(View.VISIBLE);

            super.onPreExecute();
        }

        @Override
        protected Joke doInBackground(Void... voids) {
            Joke joke = new JokeCatalogue().sayRandomJoke();
            return joke;
        }


        @Override
        protected void onPostExecute(Joke joke) {
            mLoadingIndicator.setVisibility(View.INVISIBLE);
            jokeLayout.setVisibility(View.VISIBLE);
            appTitle.setVisibility(View.INVISIBLE);
            if(jokeTitleText.getText().equals(joke.getTitle())){
                return;
            }
            jokeTitleText.setText(joke.getTitle());
            jokeDescText.setText(joke.getDesc());
            super.onPostExecute(joke);
        }

    }

}
