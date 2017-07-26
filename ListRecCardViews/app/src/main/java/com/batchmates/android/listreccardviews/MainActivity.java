package com.batchmates.android.listreccardviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private RecyclerView recyclerView;
    private ListView lvContacts;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private DefaultItemAnimator itemAnimator;
    private List<Contact> contactList=new ArrayList<>();
    private ContactListAdapter contactListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //List View
        lvContacts=(ListView)findViewById(R.id.lvContacts);

        String[] values = new String[]{"Richard","Will","Ace","Raul","Ivy"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values);


        lvContacts.setAdapter(adapter);


        //Recycle View
        contactList.add(new Contact("Richard","9517046773","10/30/1988"));
        contactList.add(new Contact("Will","76q10q6","11/29/1989"));
        contactList.add(new Contact("Raul","768706986","5/10/1980"));
        contactList.add(new Contact("Ace","178639842","1/3/1976"));
        contactList.add(new Contact("Ivy","9875764","9/2/1972"));



        //hook up to the view
        recyclerView=(RecyclerView)findViewById(R.id.rcContacts);

        //sedt up manager animator
        //layoutManager=new LinearLayoutManager(this,GridLayoutManager.HORIZONTAL,true);
        layoutManager =new GridLayoutManager(this,2,LinearLayoutManager.HORIZONTAL,true);
        //GridLayoutManager manager= new GridLayoutManager(this,2);
        itemAnimator=new DefaultItemAnimator();
        //contact adapter created
        contactListAdapter=new ContactListAdapter(contactList);

        //set
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.setAdapter(contactListAdapter);

    }

    public void clicker(View view) {

        contactList.add(new Contact("Manny", "19836r598165","1/1/1"));

        contactListAdapter.notifyDataSetChanged();
    }
}
