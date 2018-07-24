package com.example.android.miwok;

public class Word {

    // Default translation for word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the work*/
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
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

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /** get Audio from the word*/
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

}

