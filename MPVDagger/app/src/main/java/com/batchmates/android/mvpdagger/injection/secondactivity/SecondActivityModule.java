package com.batchmates.android.mvpdagger.injection.secondactivity;

import com.batchmates.android.mvpdagger.view.activities.secondactivity.SecondActivityPresenter;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Android on 7/12/2017.
 */

@Module
public class SecondActivityModule {

    @Provides
    public SecondActivityPresenter provideSecondActivityPresenter()
    {
        return new SecondActivityPresenter();
    }
}
