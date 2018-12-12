package com.eslamshawky.hp.cardviewtest;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ContactAdapter extends RecyclerView.Adapter <ContactAdapter.ContactViewHolder> {

    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Context ctx;

    public ContactAdapter(ArrayList<Contact> contacts,Context ctx) {
        this.contacts = contacts;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
     ContactViewHolder contactViewHolder = new ContactViewHolder(view,ctx,contacts);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        Contact con = contacts.get(position);
        holder.person_image.setImageResource(con.getImage_id());
        holder.text_name.setText(con.getName());
        holder.text_email.setText(con.getEmail());
        holder.text_mobile.setText(con.getMobile());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView person_image;
        TextView text_name,text_email,text_mobile;
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        Context ctx;
        public ContactViewHolder(View view,Context ctx , ArrayList<Contact> contacts) {
            super(view);
            this.contacts = contacts;
            this.ctx = ctx;
            view.setOnClickListener(this);
        person_image = (ImageView)view.findViewById(R.id.image_person);
        text_name = (TextView)view.findViewById(R.id.text_name);
        text_email = (TextView)view.findViewById(R.id.text_email);
        text_mobile = (TextView)view.findViewById(R.id.text_phone);
        }

        @Override
        public void onClick(View v) {
    int position = getAdapterPosition();
        Contact contact = this.contacts.get(position);
        Intent intent = new Intent(this.ctx,ContactDetails.class);
        intent.putExtra("img_id",contact.getImage_id());
        intent.putExtra("name",contact.getName());
        intent.putExtra("email",contact.getEmail());
        intent.putExtra("mobile",contact.getMobile());
        this.ctx.startActivity(intent);
        }
    }
}
