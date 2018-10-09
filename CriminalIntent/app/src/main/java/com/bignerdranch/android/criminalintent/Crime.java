package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * 项目名：CriminalIntent
 * 包名：  com.bignerdranch.android.criminalintent
 * 文件名：Crime
 * Created by liushengjie on 2018/10/8.
 * 描述：
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}