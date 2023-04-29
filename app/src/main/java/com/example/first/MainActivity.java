package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addHobbyButton = findViewById(R.id.addHobbyButton);

        addHobbyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText hobbyEditText = findViewById(R.id.hobbyEditText);
                String hobby = hobbyEditText.getText().toString();
                if (!hobby.isEmpty()) {
                    LinearLayout hobbyLinearLayout = findViewById(R.id.hobbyLinearLayout);
                    TextView hobbyTextView = new TextView(MainActivity.this);
                    hobbyTextView.setText(hobby);
                    hobbyLinearLayout.addView(hobbyTextView);
                    hobbyEditText.setText("");
                    ScrollView hobbyScrollView = findViewById(R.id.hobbyScrollView);
                    hobbyScrollView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}