package com.example.rating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn14;
    TextView view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn14 = findViewById(R.id.btn14);

        btn14.setOnClickListener(new View.OnClickListener(){
          @Override
                  public void onClick(View view)
        {
            view1 = findViewById(R.id.view1);
            String answer = view1.getText().toString();
            view1.setText(answer+1);

        }

        });
    }

    }

