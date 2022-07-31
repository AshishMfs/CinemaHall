package mfs.ashish.cinemahall.home.movie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import mfs.ashish.cinemahall.R;
import mfs.ashish.cinemahall.pojo.Movie;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<Movie> movieList;

    MovieAdapter(List<Movie> list) {
        this.movieList = list;
    }

//    void setMovieList(List<Movie> movieList){
//        this.movieList = movieList;
//    }

    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.movie_list_item, parent, false);
        MovieViewHolder viewHolder = new MovieViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);

        Picasso.get()
                .load("https://image.tmdb.org/t/p/w220_and_h330_face" + movie.getBannerUrl())
                .into(holder.imageView);

        holder.title.setText(movie.getTitle());
        holder.rating.setText(movie.getVoteAvg());
        holder.popularity.setText(movie.getPopularity());
        holder.date.setText(movie.getReleaseDate());
        holder.desc.setText(movie.getDescription());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView title;
        private TextView rating;
        private TextView popularity;
        private TextView date;
        private TextView desc;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.movieBanner);
            title = itemView.findViewById(R.id.title);
            rating = itemView.findViewById(R.id.rating);
            popularity = itemView.findViewById(R.id.popularity);
            date = itemView.findViewById(R.id.releaseDate);
            desc = itemView.findViewById(R.id.description);
        }
    }
}
