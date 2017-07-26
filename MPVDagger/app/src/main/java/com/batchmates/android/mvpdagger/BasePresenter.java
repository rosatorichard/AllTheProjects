package com.batchmates.android.mvpdagger;

/**
 * Created by Android on 7/12/2017.
 */

public interface BasePresenter<V extends BaseView> {


    void addview(V view);

    void removeView();
}
