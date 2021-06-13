package com.example.gumaapp;

import android.icu.text.UnicodeMatcher;

public class User {
    public String nama, nim, email;
    public User(){
    }

    public User(String nama, String nim, String email){
        this.nama= nama;
        this.nim= nim;
        this.email= email;
    }
}
