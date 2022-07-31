package mfs.ashish.cinemahall.home.movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import mfs.ashish.cinemahall.R;
import mfs.ashish.cinemahall.api.ApiServiceInterface;
import mfs.ashish.cinemahall.api.RetrofitClient;
import mfs.ashish.cinemahall.pojo.Movie;
import mfs.ashish.cinemahall.pojo.MovieDiscoverResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieOverviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        ApiServiceInterface apiClient = RetrofitClient.getRetrofitInstance().create(ApiServiceInterface.class);

        Call<MovieDiscoverResponse> call = apiClient.getMovies(getString(R.string.api_key));

        call.enqueue(new Callback<MovieDiscoverResponse>() {
            @Override
            public void onResponse(Call<MovieDiscoverResponse> call, Response<MovieDiscoverResponse> response) {
                List<Movie> movieList = response.body().getResult();
                movieAdapter = new MovieAdapter(movieList);

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(movieAdapter);
            }

            @Override
            public void onFailure(Call<MovieDiscoverResponse> call, Throwable t) {
                Log.e("Rajneesh", t.getMessage().toString());
            }
        });
    }
}