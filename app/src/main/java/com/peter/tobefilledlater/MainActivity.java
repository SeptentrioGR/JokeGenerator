package com.peter.tobefilledlater;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final int DETAIL_REQUEST = 1;
    Button mButton = null;
    TextView jokeTitleText = null;
    TextView jokeDescText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeTitleText = (TextView)findViewById(R.id.jokeTitle);
        jokeDescText = (TextView)findViewById(R.id.jokeDesc);


        mButton = (Button)findViewById(R.id.toSecondActivity);
        mButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(v.getContext(),returnJoke.class);
               i.putExtra("jokeTitle","Get a joke");
               startActivityForResult(i,DETAIL_REQUEST);
           }
       });



    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(resultCode == RESULT_OK && requestCode == DETAIL_REQUEST){
            if(data.hasExtra("jokeTitle") && data.hasExtra("jokeDesc")){
                String titleValue = data.getExtras().getString("jokeTitle");
                String descValue = data.getExtras().getString("jokeDesc");
                jokeTitleText.setText(titleValue);
                jokeDescText.setText(descValue);
            }
        }
    }

}
