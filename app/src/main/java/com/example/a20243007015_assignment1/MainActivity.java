package com.example.a20243007015_assignment1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // facilities button
    public void openFacilities(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_id", 0);
        startActivity(intent);
    }
    // events button
    public void openEvents(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_id", 1);
        startActivity(intent);
    }
    // clubs button
    public void openClubs(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_id", 2);
        startActivity(intent);
    }
    // support button
    public void openSupport(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("topic_id", 3);
        startActivity(intent);
    }


}