package mfs.ashish.cinemahall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import mfs.ashish.cinemahall.api.ApiServiceInterface;
import mfs.ashish.cinemahall.api.RetrofitClient;
import mfs.ashish.cinemahall.pojo.MovieDiscoverResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiServiceInterface apiClient = RetrofitClient.getRetrofitInstance().create(ApiServiceInterface.class);

        Call<MovieDiscoverResponse> call = apiClient.getMovies(getString(R.string.api_key));

        call.enqueue(new Callback<MovieDiscoverResponse>() {
            @Override
            public void onResponse(Call<MovieDiscoverResponse> call, Response<MovieDiscoverResponse> response) {
                Log.e("Rajneesh", response.body().toString());
            }

            @Override
            public void onFailure(Call<MovieDiscoverResponse> call, Throwable t) {
                Log.e("Rajneesh", t.getMessage().toString());
            }
        });
    }
}