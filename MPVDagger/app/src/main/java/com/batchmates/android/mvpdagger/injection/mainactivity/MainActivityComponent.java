package com.batchmates.android.mvpdagger.injection.mainactivity;

import com.batchmates.android.mvpdagger.view.activities.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by Android on 7/12/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
