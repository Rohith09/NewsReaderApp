package com.example.chandrassekhar.newsreaderapp.Interface;

import android.provider.ContactsContract;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by chandrassekhar on 01/03/18.
 */

public interface NewsService {
    @GET("v2/sources?language=en")
    Call<ContactsContract.CommonDataKinds.Website> getSources();

}
