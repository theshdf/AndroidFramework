package fun.shdf.java_aac.ui;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import fun.shdf.java_aac.base.CallBack;
import fun.shdf.java_aac.base.viewmodel.BaseViewModel;

/**
 * code-time: 2018/9/21 10:47
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public class HomeViewModel extends BaseViewModel<HomeReposity>{

    private MutableLiveData<String> homeData;

    /**
     * 可以引入application，并且完成初始化工作
     *

     */
    public HomeViewModel() {

    }

    /**
     *
     * @return
     */
    public LiveData<String> bind(){
        if(null == homeData)
            homeData = new MutableLiveData<>();

        return  homeData;
    }

    public void getHomeData(String username,String password){
        mReposity.getHomeData(username, password, new CallBack<String>() {

            @Override
            public void onSuccessData(String data) {
                homeData.postValue("haha");
            }

            @Override
            public void onSuccessMsg(String msg) {
                homeData.postValue("heihei");
            }

            @Override
            public void onFailer(String msg) {
                if(TextUtils.isEmpty(msg)){
                    if(TextUtils.isEmpty(msg)){
                        homeData.postValue("lelele");
                    }
                }

            }
        });
    }
}
