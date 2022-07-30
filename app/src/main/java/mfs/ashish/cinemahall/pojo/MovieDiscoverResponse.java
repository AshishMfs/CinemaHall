package mfs.ashish.cinemahall.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDiscoverResponse {
    @SerializedName("results")
    private List<Movie> results;

    public List<Movie> getResult() {
        return results;
    }

    public void setResult(List<Movie> result) {
        this.results = result;
    }

    @Override
    public String toString() {
        return "MovieDiscoverResponse{" +
                "result=" + results +
                '}';
    }
}