package com.example.android.miwok;

/**
 * Created by nkumar on 8/11/16.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    private int maudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public Word(String miwokTranslation, String defaultTranslation, int maudioResourceID) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.maudioResourceID = maudioResourceID;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID, int maudioResourceID) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceID = imageResourceID;
        this.maudioResourceID = maudioResourceID;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public boolean isImageProvided(){
        return !(imageResourceID == NO_IMAGE_PROVIDED);
    }

    public int getMaudioResourceID(){
        return maudioResourceID;
    }
}
