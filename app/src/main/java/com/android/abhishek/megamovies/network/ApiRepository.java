package com.android.abhishek.megamovies.network;

import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.android.abhishek.megamovies.model.MovieDetail;
import com.android.abhishek.megamovies.model.PersonProfile;
import com.android.abhishek.megamovies.model.ShowList;
import com.android.abhishek.megamovies.model.TvDetail;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiRepository {

    private ApiInterface apiInterface = BuildUrl.getRetrofit().create(ApiInterface.class);

    public MutableLiveData<ShowList> loadPopularMovies(String API_KEY, int CURRENT_PAGE){
        final MutableLiveData<ShowList> popularMovieList = new MutableLiveData<>();
        apiInterface.getPopularMovies(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                popularMovieList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return popularMovieList;
    }

    public MutableLiveData<ShowList> loadTopRatedMovies(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> topRatedMovieList  = new MutableLiveData<>();
        apiInterface.getTopRatedMovies(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                topRatedMovieList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return topRatedMovieList;
    }

    public MutableLiveData<ShowList> loadUpcomingMovies(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> upcomingMovieList = new MutableLiveData<>();
        apiInterface.getUpcomingMovies(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                upcomingMovieList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return upcomingMovieList;
    }

    public MutableLiveData<ShowList> loadNowPlayingMovies(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> nowPlayingMovieList = new MutableLiveData<>();
        apiInterface.getNowPlayingMovies(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                nowPlayingMovieList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return nowPlayingMovieList;
    }

    public MutableLiveData<MovieDetail> loadMovieDetailFromApi(String movieId,String ApiKey,String AppendQuery){
        final MutableLiveData<MovieDetail> movieDetailFromApi = new MutableLiveData<>();
        apiInterface.getMovieDetail(movieId,ApiKey,AppendQuery).enqueue(new Callback<MovieDetail>() {
            @Override
            public void onResponse(@NonNull Call<MovieDetail> call, @NonNull Response<MovieDetail> response) {
                movieDetailFromApi.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<MovieDetail> call, @NonNull Throwable t) {

            }
        });
        return movieDetailFromApi;
    }

    public MutableLiveData<TvDetail> loadTvDetailFromApi(String tvId,String ApiKey,String AppendQuery){
        final MutableLiveData<TvDetail> tvDetailFromApi = new MutableLiveData<>();
        apiInterface.getTvDetail(tvId,ApiKey,AppendQuery).enqueue(new Callback<TvDetail>() {
            @Override
            public void onResponse(@NonNull Call<TvDetail> call, @NonNull Response<TvDetail> response) {
                tvDetailFromApi.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<TvDetail> call, @NonNull Throwable t) {

            }
        });
        return tvDetailFromApi;
    }

    public MutableLiveData<ShowList> loadPopularTv(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> popularTvList = new MutableLiveData<>();
        apiInterface.getPopularTv(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                popularTvList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return popularTvList;
    }

    public MutableLiveData<ShowList> loadTopRatedTv(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> topRatedTvList = new MutableLiveData<>();
        apiInterface.getTopRatedTv(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                topRatedTvList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return topRatedTvList;
    }

    public MutableLiveData<ShowList> loadOnTheAirTv(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> onTheAirTvList = new MutableLiveData<>();
        apiInterface.getOnTheAir(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                onTheAirTvList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return onTheAirTvList;
    }

    public MutableLiveData<ShowList> loadAiringTodayTv(String API_KEY,int CURRENT_PAGE){
        final MutableLiveData<ShowList> airingTodayTvList = new MutableLiveData<>();
        apiInterface.getAiringToday(API_KEY,CURRENT_PAGE).enqueue(new Callback<ShowList>() {
            @Override
            public void onResponse(@NonNull Call<ShowList> call, @NonNull Response<ShowList> response) {
                airingTodayTvList.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<ShowList> call, @NonNull Throwable t) {

            }
        });
        return airingTodayTvList;
    }

    public MutableLiveData<PersonProfile> loadProfile(String API_KEY,String id){
        final MutableLiveData<PersonProfile> personProfile = new MutableLiveData<>();
        apiInterface.getProfile(id,API_KEY).enqueue(new Callback<PersonProfile>() {
            @Override
            public void onResponse(@NonNull Call<PersonProfile> call, @NonNull Response<PersonProfile> response) {
                personProfile.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<PersonProfile> call, @NonNull Throwable t) {

            }
        });
        return personProfile;
    }

}
