package com.example.android.miwok;

/**
 * Created by Naruto on 12/03/2018.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResource = NO_IMAGE;
    private int audioResource;
    private static final int NO_IMAGE = -1;

    public Word(int audioResource, String miwokTranslation, String defaultTranslation){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.audioResource = audioResource;
    }

    public Word(int audioResource, int resourceImage, String miwokTranslation, String defaultTranslation) {
        this.imageResource = resourceImage;
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.audioResource = audioResource;
    }

    public int getImageResource () {
        return imageResource;
    }

    public String getMiwokTranslation () {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public boolean hasImage() {
        return imageResource != NO_IMAGE;
    }

    public int getAudioResource() {
        return audioResource;
    }
}
