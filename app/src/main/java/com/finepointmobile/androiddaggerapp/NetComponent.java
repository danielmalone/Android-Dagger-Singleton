package com.finepointmobile.androiddaggerapp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by danielmalone on 7/29/17.
 */

@Singleton
@Component(modules = {NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
