package com.example.mobileprog1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    public void clickTrigger(View v)
    {
        AutoCompleteTextView name=(AutoCompleteTextView)findViewById(R.id.field1);
        double dollar=Double.parseDouble(name.getText().toString());
        String s=String.valueOf(dollar*0.78);
        Log.d("pound",s);
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
        count=(count+1)%2;
        ImageView img = (ImageView) findViewById(R.id.imageView);
        if(count==1) {
            img.setImageResource(R.mipmap.ic_launcher_round);
        }
        else
        {
            img.setImageResource(R.mipmap.ic_launcher);
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
