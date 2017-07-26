package com.batchmates.android.murdermystery;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

public class TheHouse extends AppCompatActivity implements AdapterView.OnItemClickListener,StoryFrag.OnFragmentInteractionListener{

    private static final String STORY_FRAG = "Outside the house";
    private DrawerLayout drawerLayout;
    private ListView listView;
    private String[] activities;
    private FrameLayout layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_house);

        layout=(FrameLayout)findViewById(R.id.homeLayout);
        listView=(ListView)findViewById(R.id.lvChoices);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        activities=getResources().getStringArray(R.array.choices);



        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, activities));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);



        listView.setOnItemClickListener(this);

        StoryFrag frag=new StoryFrag();

        FragmentManager manager;

        getSupportFragmentManager().beginTransaction().add(R.id.homeFrag,frag,STORY_FRAG).addToBackStack(STORY_FRAG).commit();


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast toast = Toast.makeText(this, "Clicked " + activities[position], Toast.LENGTH_SHORT);
//        toast.show();

        switch (position) {
            case 0:
                Toast.makeText(this,"Write a Note",Toast.LENGTH_LONG).show();
                break;

            case 1:
                Toast.makeText(this,"Look at notes",Toast.LENGTH_LONG).show();
                break;

            case 2:
                Toast.makeText(this,"Forward",Toast.LENGTH_LONG).show();
                break;

            case 3:
                Toast.makeText(this,"Back",Toast.LENGTH_LONG).show();
                break;

            case 4:
                Toast.makeText(this,"Solve",Toast.LENGTH_LONG).show();
                break;

        }
        drawerLayout.closeDrawers();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=new MenuInflater(this);
        m.inflate(R.menu.overflow_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
