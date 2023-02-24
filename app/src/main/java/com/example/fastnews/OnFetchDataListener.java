package com.example.fastnews;

import com.example.fastnews.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message );
    void onError(String message);
}
