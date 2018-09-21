package fun.shdf.java_aac.base.view;

import android.arch.lifecycle.ViewModelProviders;
import android.util.Log;
import fun.shdf.java_aac.base.viewmodel.BaseViewModel;
import fun.shdf.java_aac.ui.HomeViewModel;
import fun.shdf.java_aac.utils.GenericUtil;

/**
 * code-time: 2018/9/20
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:升级版的activity,适用于需要网络请求的activity,由于activity有的具有此功能，有的不具备，所以单独把需要网络请求的
 * 的功能放在接口实现接口，如果继承的话，父类中已经封装的逻辑不易改变
 **/
public abstract class ProBaseActivity<T extends BaseViewModel> extends BaseActivity implements NetInterface{

    protected T mViewModel;


    public void initInstance(){
        try {
            mViewModel = ViewModelProviders.of(this).get((Class<T>) GenericUtil.getInstance(this,0));
        }
        catch (Exception e){
            Log.d("TAG","aaa"+e.getMessage());
        }


    }

}
