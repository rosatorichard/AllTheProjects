package com.batchmates.android.mvpdagger.injection.mainactivity;

import com.batchmates.android.mvpdagger.view.activities.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Android on 7/12/2017.
 */
@Module
public class MainActivityModule {

    @Provides
    public MainActivityPresenter provideMainActivityPresenter()
    {
        return new MainActivityPresenter();
    }


}
