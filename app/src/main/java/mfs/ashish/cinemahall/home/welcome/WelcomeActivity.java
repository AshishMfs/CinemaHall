package mfs.ashish.cinemahall.home.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mfs.ashish.cinemahall.R;
import mfs.ashish.cinemahall.home.movie.MovieOverviewActivity;
import mfs.ashish.cinemahall.home.tv.TvActivity;


public class WelcomeActivity extends AppCompatActivity {
    private Button movieButton;
    private Button tvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        movieButton = findViewById(R.id.movieButton);
        tvButton = findViewById(R.id.tvButton);

        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MovieOverviewActivity.class);
                startActivity(intent);
            }
        });

        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TvActivity.class);
                startActivity(intent);
            }
        });
    }




}