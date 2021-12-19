package com.arvin.thirukkural;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class user_profile extends AppCompatActivity {

    CircleImageView img;
    TextView name , message, meaning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        img=findViewById(R.id.profileimage);
        name=findViewById(R.id.username);
        message=findViewById(R.id.usermessage);
        meaning=findViewById(R.id.usermeaning);

        Intent intent=this.getIntent();

        String username=intent.getStringExtra("name");
        String usermessage=intent.getStringExtra("message");
        String usermeaning=intent.getStringExtra("meaning");
        int imageid=intent.getIntExtra("image",R.drawable.circle);

        name.setText(username);
        message.setText(usermessage);
        meaning.setText(usermeaning);
        img.setImageResource(imageid);


    }
}