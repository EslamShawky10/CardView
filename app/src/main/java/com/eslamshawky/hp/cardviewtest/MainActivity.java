package com.eslamshawky.hp.cardviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.Adapter adapter;
RecyclerView.LayoutManager layoutManager;
ArrayList<Contact>list = new ArrayList<Contact>();
int [] image = {R.drawable.camera,R.drawable.esss,R.drawable.face,R.drawable.fedora_flat,R.drawable.jh,
                R.drawable.logo,R.drawable.mak,R.drawable.sea,R.drawable.user};
String[]name,email,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=getResources().getStringArray(R.array.person_name);
        email=getResources().getStringArray(R.array.person_email);
        mobile=getResources().getStringArray(R.array.person_phone);
        int count = 0;
        for (String Name:name){
            Contact contact = new Contact(image[count],Name,email[count],mobile[count]);
            count++;
            list.add(contact);
      }

      recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new ContactAdapter(list,this);
        recyclerView.setAdapter(adapter);
      }
   }
