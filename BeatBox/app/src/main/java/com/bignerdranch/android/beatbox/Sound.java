package com.bignerdranch.android.beatbox;

/**
 * 项目名：BeatBox
 * 包名：  com.bignerdranch.android.beatbox
 * 文件名：Sound
 * Created by liushengjie on 2018/10/29.
 * 描述：
 */

public class Sound {

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }


}
