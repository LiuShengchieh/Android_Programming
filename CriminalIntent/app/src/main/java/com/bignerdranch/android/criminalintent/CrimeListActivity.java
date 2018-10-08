package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * 项目名：CriminalIntent
 * 包名：  com.bignerdranch.android.criminalintent
 * 文件名：CrimeListActivity
 * Created by liushengjie on 2018/10/8.
 * 描述：
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
