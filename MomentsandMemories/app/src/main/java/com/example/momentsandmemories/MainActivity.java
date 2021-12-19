package com.example.momentsandmemories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton previous,next;
    ImageView pic;
    TextView text;
    int currentImage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void previous(View view) {
        String idx = "pic" + currentImage;
        int earlier_img = this.getResources().getIdentifier(idx, "id", getPackageName());//integer id for earlier image  //get integer id from string id ide
        pic=findViewById(earlier_img);
        pic.setAlpha(0f);

        currentImage=(8+currentImage-1)%8;  // to get previous image id
        String idy = "pic" + currentImage;
        int current_img = this.getResources().getIdentifier(idy, "id", getPackageName());//integer id for earlier image  //get integer id from string id ide
        pic=findViewById(current_img);
        pic.setAlpha(1f);
    }
    public void next(View view)
    {
        String idx = "pic" + currentImage;
        int earlier_img = this.getResources().getIdentifier(idx, "id", getPackageName());//integer id for earlier image  //get integer id from string id ide
        pic=findViewById(earlier_img);
        pic.setAlpha(0f);

        currentImage=(currentImage+1)%8;  // to get previous image id
        String idy = "pic" + currentImage;
        int current_img = this.getResources().getIdentifier(idy, "id", getPackageName());//integer id for earlier image  //get integer id from string id ide
        pic=findViewById(current_img);
        pic.setAlpha(1f);
    }

}