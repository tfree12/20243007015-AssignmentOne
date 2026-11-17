package com.example.a20243007015_assignment1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars());

                    v.setPadding(systemBars.left, systemBars.top,
                            systemBars.right, systemBars.bottom);

                    return insets;
                });

        // Get the selected topic
        int topicId = getIntent().getIntExtra("topic_id", 0);

        // Load data from arrays.xml
        String[] images = getResources().getStringArray(
                R.array.string_array_images);

        String[] titles = getResources().getStringArray(
                R.array.string_array_titles);

        String[] contents = getResources().getStringArray(
                R.array.string_array_content);

        // Find the views
        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailCategory = findViewById(R.id.detailCategory);
        TextView detailTitle = findViewById(R.id.detailTitle);
        TextView detailContent = findViewById(R.id.detailContent);

        // Set category name
        String[] categories = {
                "Facilities",
                "Events",
                "Clubs",
                "Support"
        };

        detailCategory.setText(categories[topicId]);

        // Set title and content
        detailTitle.setText(titles[topicId]);
        detailContent.setText(contents[topicId]);

        // Set the correct image
        String imageName = images[topicId].trim();

        int imageId = getResources().getIdentifier(
                imageName, "drawable", getPackageName());

        detailImage.setImageResource(imageId);
    }
}