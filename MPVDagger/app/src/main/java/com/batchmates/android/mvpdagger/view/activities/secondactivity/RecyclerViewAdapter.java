package com.batchmates.android.mvpdagger.view.activities.secondactivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.batchmates.android.mvpdagger.R;
import com.batchmates.android.mvpdagger.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 7/12/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<Person> personList=new ArrayList<>();

    public RecyclerViewAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.firstname.setText(personList.get(position).getFirstName());
        holder.lastname.setText(personList.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstname;
        TextView lastname;
        public ViewHolder(View itemView) {
            super(itemView);
            firstname=(TextView)itemView.findViewById(R.id.tvRecyclerFirstName);
            lastname=(TextView)itemView.findViewById(R.id.tvRecyclerLastName);
        }
    }
}
