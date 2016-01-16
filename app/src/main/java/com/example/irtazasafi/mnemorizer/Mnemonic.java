package com.example.irtazasafi.mnemorizer;

import com.google.gson.annotations.Expose;

/**
 * Created by Irtaza Safi on 1/12/2016.
 */
public class Mnemonic {


    @Expose public int id;
    @Expose public String mnemonic;
    @Expose public int wordid;
    @Expose public int score;
    @Expose public int creatorid;
    @Expose public double latitude;
    @Expose public double longitude;

    public Mnemonic(int _ID,String _mnemonic,int _wordid,int _score,int _creatorID,double _latitude, double _longitude){
        id = _ID;
        mnemonic = _mnemonic;
        wordid = _wordid;
        score = _score;
        creatorid = _creatorID;
        latitude = _latitude;
        longitude = _longitude;
    }
}
