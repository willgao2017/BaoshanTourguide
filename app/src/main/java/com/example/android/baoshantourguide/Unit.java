package com.example.android.baoshantourguide;

/**
 * Created by will on 2017/5/19.
 */

public class Unit {
    private String mUnitName;
    private String mUnitAddress;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Unit(String unitName, String unitAddress){
        mUnitName = unitName;
        mUnitAddress = unitAddress;
    }

    public Unit(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mUnitName = defaultTranslation;
        mUnitAddress = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getUnitName() {
        return mUnitName;
    }

    public String getUnitAddress() {
        return mUnitAddress;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    boolean hasImage () {
        if (mImageResourceID == NO_IMAGE_PROVIDED)
            return false;
        else
            return true;
    }
}