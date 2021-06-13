package com.example.gumaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.ybq.android.spinkit.style.CubeGrid;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 5000;

    //Hooks
    View first,second,third,fourth,fifth,sixth,seventh;
    TextView tex1,tex2;
    ProgressBar progressBar;

    //animation

    Animation topAnimation,bottomAnimation,middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        progressBar= findViewById(R.id.spin_kit);


        CubeGrid cubeGrid = new CubeGrid();
        progressBar.setIndeterminateDrawable(cubeGrid);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        //hook

        first=findViewById(R.id.first_line);
        second=findViewById(R.id.second_line);
        third=findViewById(R.id.third_line);
        fourth=findViewById(R.id.fourth_line);
        fifth=findViewById(R.id.fifth_line);
        sixth=findViewById(R.id.sixth_line);
        seventh=findViewById(R.id.seventh_line);

        tex1 =findViewById(R.id.tex1);
        tex2= findViewById(R.id.tex2);

        //setting animation

        first.setAnimation (topAnimation);
        second.setAnimation (topAnimation);
        third.setAnimation (topAnimation);
        fourth.setAnimation (topAnimation);
        fifth.setAnimation (topAnimation);
        sixth.setAnimation (topAnimation);
        seventh.setAnimation(topAnimation);

        tex1.setAnimation (middleAnimation);
        tex2.setAnimation(bottomAnimation);

        //splash screen

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
            finish();
        },SPLASH_TIME_OUT);

    }
}