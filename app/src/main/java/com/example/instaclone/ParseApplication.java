package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SBMgJwbhcpNSQJIEhjGiHDAFs1eHn9OFEFdVB8kk")
                .clientKey("xHu3W05bMmN0pADfYg7eIkOw5KdWWaqV7fMHiBmv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
