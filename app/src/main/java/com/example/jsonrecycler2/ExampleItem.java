package com.example.jsonrecycler2;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    String urlchapter;

    public ExampleItem(String mImageUrl, String mCreator, int mLikes, String urlchapter) {
        this.mImageUrl = mImageUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;
        this.urlchapter = urlchapter;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public void setmCreator(String mCreator) {
        this.mCreator = mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }

    public void setmLikes(int mLikes) {
        this.mLikes = mLikes;
    }

    public String getUrlchapter() {
        return urlchapter;
    }

    public void setUrlchapter(String urlchapter) {
        this.urlchapter = urlchapter;
    }
}

