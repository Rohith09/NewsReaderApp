package com.example.chandrassekhar.newsreaderapp.Common;


import com.example.chandrassekhar.newsreaderapp.Interface.NewsService;
import com.example.chandrassekhar.newsreaderapp.Remote.RetrofitClient;

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY="61c7c0c3f69e4fbb8da7082fa1226ff4";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }
}

