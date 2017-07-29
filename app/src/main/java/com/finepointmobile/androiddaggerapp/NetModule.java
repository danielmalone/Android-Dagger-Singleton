package com.finepointmobile.androiddaggerapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by danielmalone on 7/29/17.
 */

@Module
public class NetModule {

    String mBaseUrl;

    public NetModule(String baseUrl) {
        mBaseUrl = baseUrl;
    }

    @Provides
    @Singleton
    String getBaseUrl() {
        return mBaseUrl;
    }
}
