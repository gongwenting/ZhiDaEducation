package com.zhida.zhidaeducation.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import butterknife.ButterKnife;


/**
 * Author:    巩文婷
 * Version    V1.0
 * Date:      2017/9/22 0014 下午 2:04
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2017/9/14 0014         巩文婷               V1.0
 */
public abstract class BaseActivity<T extends BaseP> extends AppCompatActivity implements BaseV {
    protected String TAG = "";
    protected T presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();

        setContentView(getLayout());
        ButterKnife.bind(this);
        init();
    }

    public void toActivity0(String action) {
        Intent intent = new Intent(action);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    /**
     * 初始化变量，包括Intent带的数据和Activity内的变量。
     */
    protected abstract void initVariables();
    /**
     * 指定加载布局
     * @return 返回布局
     */
    protected abstract int getLayout();
    /**
     * 初始化
     */
    protected abstract void init();




    /**
     * 显示显示吐司
     *
     * @param text 吐司显示文本
     */
    @Override
    public void showShortToast(String text) {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }

    /**
     * 网路请求返回数据
     *
     * @param requestCode 请求码
     * @param data        数据
     */
    @Override
    public void returnData(int requestCode, Object data) {

    }

    /**
     * 网络请求结束
     */
    @Override
    public void httpFinish() {

    }
}
