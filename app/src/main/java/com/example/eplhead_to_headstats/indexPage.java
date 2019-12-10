package com.example.eplhead_to_headstats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class indexPage extends AppCompatActivity {
    private Button enterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_page);
        enterButton = findViewById(R.id.enterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openrulePage();
            }
        });
    }

    public void openrulePage() {
        Intent intent = new Intent(this, rulePage.class);
        startActivity(intent);
    }
}
