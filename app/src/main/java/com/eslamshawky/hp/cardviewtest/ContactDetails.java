package com.eslamshawky.hp.cardviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetails extends AppCompatActivity {
ImageView image;
TextView name,email,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        image = (ImageView)findViewById(R.id.image_contact);
        name = (TextView)findViewById(R.id.text_namecontact);
        email = (TextView)findViewById(R.id.text_emailcontact);
        mobile = (TextView)findViewById(R.id.text_phonecontact);
        image.setImageResource(getIntent().getIntExtra("img_id",00));
        name.setText("Name: "+getIntent().getStringExtra("name"));
        name.setText("Email: "+getIntent().getStringExtra("email"));
        name.setText("Mobile: "+getIntent().getStringExtra("mobile"));

    }
}
