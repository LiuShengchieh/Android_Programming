package com.bignerdranch.android.photogallery;

/**
 * 项目名：PhotoGallery
 * 包名：  com.bignerdranch.android.photogallery
 * 文件名：GalleryItem
 * Created by liushengjie on 2018/11/6.
 * 描述：
 */

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @Override
    public String toString() {
        return mCaption;
    }
}
