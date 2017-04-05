package com.example.rok.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by rok on 2017. 4. 4..
 */

public class data extends MainFragement{
    ArrayList grape = new ArrayList();
    ArrayList apple = new ArrayList();
    ArrayList kiwi = new ArrayList();
    ArrayList ja = new ArrayList();
    public void getdata(String a){

        grape.add(a);
    }
    public void setdata(int i, String a){

        grape.set(i,a);
    }
    public String returndata(int i){
        return (String) grape.get(i);
    }

    public void applegetdata(String a){

        apple.add(a);
    }
    public void applesetdata(int i, String a){

        apple.set(i,a);
    }
    public String applereturndata(int i){
        return (String) apple.get(i);
    }
    public void kiwigetdata(String a){

        kiwi.add(a);
    }
    public void kiwisetdata(int i, String a){

        kiwi.set(i,a);
    }
    public String kiwireturndata(int i){

        return (String) kiwi.get(i);
    }
    public void jagetdata(String a){
        ja.add(a);
    }
    public void jasetdata(int i, String a) {
        ja.set(i,a);
    }
    public String jareturndata(int i){

        return (String) ja.get(i);
    }
   }
