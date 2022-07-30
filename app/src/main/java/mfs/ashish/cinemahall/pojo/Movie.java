package mfs.ashish.cinemahall.pojo;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("backdrop_path")
    private String bannerUrl;

    @SerializedName("adult")
    private String adult;

    @SerializedName("original_language")
    private String language;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("overview")
    private String description;

    @SerializedName("popularity")
    private String popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("title")
    private String title;

    @SerializedName("vote_average")
    private String voteAvg;

    @SerializedName("vote_count")
    private String voteCount;

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVoteAvg() {
        return voteAvg;
    }

    public void setVoteAvg(String voteAvg) {
        this.voteAvg = voteAvg;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "bannerUrl='" + bannerUrl + '\'' +
                ", adult='" + adult + '\'' +
                ", language='" + language + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", description='" + description + '\'' +
                ", popularity='" + popularity + '\'' +
                ", posterPath='" + posterPath + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", title='" + title + '\'' +
                ", voteAvg='" + voteAvg + '\'' +
                ", voteCount='" + voteCount + '\'' +
                '}';
    }
}
