package com.zhida.zhidaeducation.base;

import android.app.Activity;


/**
 * Author:    巩文婷
 * Version    V1.0
 * Date:      2017/9/22 0018 下午 5:39
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2017/9/18 0018         巩文婷               V1.0
 */
public class BaseP {
    protected BaseV view;
    protected Activity mActivity;

    static boolean run = false;
    public BaseP(BaseV view, Activity activity) {
        this.view = view;
        mActivity = activity;
    }

    /**
     *
     * post请求
     * @param url 请求地址
     * @param requestCode 请求码
     * @param map 请求参数的map集合
     * @param <T>
     */
//    protected static <T extends BaseRP> void post(final BaseV view, final Activity mActivity, String url, final int requestCode, Map<String, String> map, final Type type){
//        //判断网络是否可用
//        if(NetworkUtils.isNetworkAvailable(mActivity)){
//            final AjaxParams params = new AjaxParams();
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                LogUtils.d("key= " + entry.getKey() + " and value= "
//                        + entry.getValue());
//                params.put(entry.getKey(), entry.getValue());
//            }
//
//            final LoadingDialog loadingDialog = new LoadingDialog( mActivity);
//            loadingDialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {
//                @Override
//                public void onDismiss(android.content.DialogInterface anInterface) {
//                    if(run)
//                    mActivity.finish();
//                }
//            });
//            loadingDialog.show();
//            run=true;
//            NetManager.Post(url, params, new AjaxCallBack<String>() {
//                @Override
//                public void onSuccess(String s) {
//                    super.onSuccess(s);
//                    LogUtils.d(s);
//                   T pack= Util.fromJson(s,type);
//                    if(pack.getStatus()==0){
//                        view.returnData(requestCode,pack);
//                    }else {
//                        view.showShortToast(pack.getMsg());
//                    }
//                    view.httpFinish();
//                     run=false;
//                    loadingDialog.dismiss();
//                }
//
//                @Override
//                public void onFailure(Throwable t, int errorNo, String strMsg) {
//                    super.onFailure(t, errorNo, strMsg);
//                    LogUtils.d("失败");
//                    view.showShortToast(strMsg+"____"+errorNo);
//                    run=false;
//                    view.httpFinish();
//                    loadingDialog.dismiss();
//                }
//            });
//        }else {
//            ButtonDialog buttonDialog= new ButtonDialog(mActivity, new DialogInterface() {
//                @Override
//                public void OkListener() {
//                    Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
//                    mActivity.startActivity(intent);
//                }
//
//                @Override
//                public void CancelListener() {
//
//                }
//
//                @Override
//                public void DismissListener() {
//
//                }
//            });
//            buttonDialog.setMsgText("当前网络不可用，请检查网络连接设置！");
//            buttonDialog.getMsgTextView().setGravity(Gravity.LEFT);
//            buttonDialog.setOkButton("去设置");
//            buttonDialog.show();
//        }
//    }
//    /**
//     *
//     * 测试post请求
//     * @param url 请求地址
//     * @param requestCode 请求码
//     * @param map 请求参数的map集合
//
//     */
//    protected  void testpost(final BaseV view, final Activity mActivity, String url, final int requestCode, Map<String, String> map){
//        //判断网络是否可用
//        if(NetworkUtils.isNetworkAvailable(mActivity)){
//            AjaxParams params = new AjaxParams();
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                LogUtils.d("key= " + entry.getKey() + " and value= "
//                        + entry.getValue());
//                params.put(entry.getKey(), entry.getValue());
//            }
//
//            NetManager.Post(url, params, new AjaxCallBack<String>() {
//                @Override
//                public void onSuccess(String s) {
//                    super.onSuccess(s);
//                    LogUtils.d(s);
//
//                }
//
//                @Override
//                public void onFailure(Throwable t, int errorNo, String strMsg) {
//                    super.onFailure(t, errorNo, strMsg);
//                    LogUtils.d("失败");
//                    view.showShortToast(strMsg+"____"+errorNo);
//                }
//            });
//        }else {
//            ButtonDialog buttonDialog= new ButtonDialog(mActivity, new DialogInterface() {
//                @Override
//                public void OkListener() {
//                    Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
//                    mActivity.startActivity(intent);
//                }
//
//                @Override
//                public void CancelListener() {
//
//                }
//
//                @Override
//                public void DismissListener() {
//
//                }
//            });
//            buttonDialog.setMsgText("当前网络不可用，请检查网络连接设置！");
//            buttonDialog.getMsgTextView().setGravity(Gravity.LEFT);
//            buttonDialog.setOkButton("去设置");
//            buttonDialog.show();
//        }
//    }

}
