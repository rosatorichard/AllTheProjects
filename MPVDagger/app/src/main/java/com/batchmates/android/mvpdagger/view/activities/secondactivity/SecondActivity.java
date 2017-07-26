package com.batchmates.android.mvpdagger.view.activities.secondactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.batchmates.android.mvpdagger.R;
import com.batchmates.android.mvpdagger.injection.secondactivity.DaggerSecondActivityComponent;
import com.batchmates.android.mvpdagger.model.Person;
import com.batchmates.android.mvpdagger.view.activities.mainactivity.MainActivityContract;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity implements SecondActivityContract.View{

    @Inject SecondActivityPresenter presenter;
    private static final String TAG = "Second Activity";
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    DefaultItemAnimator defaultItem=new DefaultItemAnimator();

//    List<Person> personList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerMyRecycler);
        layoutManager= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        SecondActivityDaggerInject();
        presenter.addview(this);
        presenter.showList(getIntent());
        presenter.fillList(getIntent());

//        personList=(List<Person>)getIntent().getSerializableExtra("PERSONLIST");
//
//        for (int i = 0; i < personList.size(); i++) {
//            Log.d(TAG, "onCreate: "+ personList.get(i).getFirstName());
//
//        }

    }

    private void SecondActivityDaggerInject() {
        DaggerSecondActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void recycleListFill(List<Person> personList) {

        recyclerViewAdapter=new RecyclerViewAdapter(personList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(defaultItem);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
