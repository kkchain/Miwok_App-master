package com.example.android.miwok;

public class Word {

    // Default translation for word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource ID for the word
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
    }

    // Get default translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    // Get Miwok translatoin of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get Miwok image of the word
    public int getImageResourceId() {
        return mImageResourceId;
    }
}

