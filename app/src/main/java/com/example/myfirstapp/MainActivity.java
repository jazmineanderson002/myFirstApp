package com.example.myfirstapp;

import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logCatButton = (Button) findViewById(R.id.logCatButton);
        logCatButton.setOnClickListener(this);
        Button toastButton = (Button) findViewById(R.id.toastButton);
        toastButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.logCatButton)
        {
            Log.i("Computer Science: ", "Learn more about Computer Science");
        }
        else if (view.getId() == R.id.toastButton)
        {
            Toast.makeText(MainActivity.this, "Softball Page",Toast.LENGTH_LONG).show();

        }
    }
}





