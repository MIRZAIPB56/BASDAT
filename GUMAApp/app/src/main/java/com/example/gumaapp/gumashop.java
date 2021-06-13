package com.example.gumaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class gumashop extends AppCompatActivity {
    private ImageButton imageButton14;
    private ImageView gumashop_po1,gumashop_po2,gumashop_po3,gumashop_po4 ;
    ConstraintLayout constraintLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gumashop);
        constraintLayout= findViewById(R.id.container);

        imageButton14= (ImageButton) findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gumashop.this, Activity3.class);
                startActivity(intent);
                finish();
            }
        });
        ImageView gumashop_po1 = findViewById(R.id.gumashop_po1);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gumashop_p1);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        gumashop_po1.setImageDrawable(mDrawable);
        gumashop_po1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(gumashop.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.gumashop_p1);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        ImageView gumashop_po2 = findViewById(R.id.gumashop_po2);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gumashop_p2);
        mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        gumashop_po2.setImageDrawable(mDrawable);
        gumashop_po2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(gumashop.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView2);
                photoView.setImageResource(R.drawable.gumashop_p2);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        ImageView gumashop_po3 = findViewById(R.id.gumashop_po3);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gumashop_p3);
        mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        gumashop_po3.setImageDrawable(mDrawable);
        gumashop_po3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(gumashop.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView3);
                photoView.setImageResource(R.drawable.gumashop_p3);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        ImageView gumashop_po4 = findViewById(R.id.gumashop_po4);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gumashop_p4);
        mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        gumashop_po4.setImageDrawable(mDrawable);
        gumashop_po4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(gumashop.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView4);
                photoView.setImageResource(R.drawable.gumashop_p4);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


    }
}