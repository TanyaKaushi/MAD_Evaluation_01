package com.example.mad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;


public class home extends AppCompatActivity {

    ImageView bgapp,coverimg;
    LinearLayout splashtext,hometext,menus;
    Animation fromBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fromBottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);


        bgapp = (ImageView) findViewById(R.id.bgapp);
        coverimg = (ImageView) findViewById(R.id.coverimg);
        splashtext = (LinearLayout) findViewById(R.id.splashtext);
        hometext = (LinearLayout) findViewById(R.id.hometext);
        menus = (LinearLayout) findViewById(R.id.menus);


        bgapp.animate().translationY(-1100).setDuration(800).setStartDelay(300);
        coverimg.animate().alpha(0).setDuration(800).setStartDelay(600);
        splashtext.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(3000);
        hometext.startAnimation(fromBottom);
        menus.setAnimation(fromBottom);

    }
}