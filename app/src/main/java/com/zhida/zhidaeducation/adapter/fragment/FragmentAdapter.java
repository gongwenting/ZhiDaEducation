package com.zhida.zhidaeducation.adapter.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zhida.zhidaeducation.utils.LogUtils;


/**
 * Author:    巩文婷
 * Version    V1.0
 * Date:      2017/9/22 0014 下午 3:05
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2017/9/14 0014         巩文婷               V1.0
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private Fragment[] mBaseFragments;
    public FragmentAdapter(FragmentManager fm ,Fragment[] mBaseFragments) {
        super(fm);
        this.mBaseFragments=mBaseFragments;
    }

    public void setBaseFragments(Fragment[] baseFragments) {
        mBaseFragments = baseFragments;
    }

    @Override
    public Fragment getItem(int i) {
        LogUtils.d(i+"");
        return mBaseFragments[i];
    }

    @Override
    public int getCount() {
        return mBaseFragments.length;
    }
}
