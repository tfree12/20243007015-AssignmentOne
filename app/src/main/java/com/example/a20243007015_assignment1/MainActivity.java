package com.example.a20243007015_assignment1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Toast;

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
        Toast.makeText(this, "Facilities clicked",
                Toast.LENGTH_SHORT).show();
    }
    // event button
    public void openEvents(View view) {
        Toast.makeText(this, "Events clicked",
                Toast.LENGTH_SHORT).show();
    }
    // club button
    public void openClubs(View view) {
        Toast.makeText(this, "Clubs clicked",
                Toast.LENGTH_SHORT).show();
    }
    //support button
    public void openSupport(View view) {
        Toast.makeText(this, "Support clicked",
                Toast.LENGTH_SHORT).show();
    }

}