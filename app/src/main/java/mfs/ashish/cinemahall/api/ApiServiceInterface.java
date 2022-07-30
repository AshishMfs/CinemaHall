package mfs.ashish.cinemahall.api;

import mfs.ashish.cinemahall.pojo.MovieDiscoverResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServiceInterface {

    @GET("discover/movie")
    public Call<MovieDiscoverResponse> getMovies(@Query("api_key") String apiKey);
}
