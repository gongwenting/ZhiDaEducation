package com.zhida.zhidaeducation.Activity;


import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.zhida.zhidaeducation.R;
import com.zhida.zhidaeducation.adapter.fragment.FragmentAdapter;
import com.zhida.zhidaeducation.base.BaseActivity;
import com.zhida.zhidaeducation.fragment.CommunityFragment;
import com.zhida.zhidaeducation.fragment.CourseFragment;
import com.zhida.zhidaeducation.fragment.HomeFragment;
import com.zhida.zhidaeducation.fragment.MineFragment;
import com.zhida.zhidaeducation.fragment.NoticeFragment;
import com.zhida.zhidaeducation.widget.NoScrollViewPager;

import butterknife.BindView;


public class MainActivity extends BaseActivity {
    @BindView(R.id.rg_bottom)
    RadioGroup rgBottom;
    private FragmentAdapter fragmentAdapter;
    private Fragment[] fragments;

    @BindView(R.id.ncv_main)
    NoScrollViewPager ncvMain;

    @Override
    protected void initVariables() {
        fragments = new Fragment[]{new HomeFragment(), new CourseFragment(), new NoticeFragment(), new CommunityFragment(), new MineFragment()};

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {


        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments);
        ncvMain.setAdapter(fragmentAdapter);
        rgBottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.rb_home:
                        ncvMain.setCurrentItem(0);
                        break;
                    case R.id.rb_course:
                        ncvMain.setCurrentItem(1);
                        break;
                    case R.id.rb_notice:
                        ncvMain.setCurrentItem(2);
                        break;
                    case R.id.rb_community:
                        ncvMain.setCurrentItem(3);
                        break;
                    case R.id.rb_mine:
                        ncvMain.setCurrentItem(4);
                        break;
                }
            }
        });

    }



}
