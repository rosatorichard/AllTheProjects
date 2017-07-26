package com.batchmates.android.mvpdagger.view.activities.secondactivity;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import com.batchmates.android.mvpdagger.BasePresenter;
import com.batchmates.android.mvpdagger.BaseView;
import com.batchmates.android.mvpdagger.model.Person;

import java.util.List;

/**
 * Created by Android on 7/12/2017.
 */

public interface SecondActivityContract {

    interface View extends BaseView
    {
        void recycleListFill(List<Person> personList);
    }

    interface presenter extends BasePresenter<View>
    {
        void showList(Intent intent);
        void fillList(Intent intent);
    }
}
