package com.batchmates.android.mvpdagger.injection.secondactivity;

import com.batchmates.android.mvpdagger.view.activities.secondactivity.SecondActivity;

import dagger.Component;

/**
 * Created by Android on 7/12/2017.
 */


@Component(modules = SecondActivityModule.class)
public interface SecondActivityComponent {

    void inject(SecondActivity secondActivity);
}
