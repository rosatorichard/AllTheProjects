package com.batchmates.android.listreccardviews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 6/27/2017.
 */

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder>{

List<Contact> contactList=new ArrayList<>();

    public ContactListAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvPhone;
        TextView tvBirth;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName=(TextView)itemView.findViewById(R.id.tvContactName);
            tvPhone=(TextView)itemView.findViewById(R.id.tvContactPhone);
            tvBirth=(TextView)itemView.findViewById(R.id.tvContactBirthday);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Contact contact= contactList.get(position);

        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());
        holder.tvBirth.setText(contact.getBirthday());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

}
