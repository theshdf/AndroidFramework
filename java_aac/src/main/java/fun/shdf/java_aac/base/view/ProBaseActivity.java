package fun.shdf.java_aac.Base.view;

import fun.shdf.java_aac.Base.viewmodel.BaseViewModel;

/**
 * code-time: 2018/9/20
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:升级版的activity,适用于需要网络请求的activity
 **/
public abstract class ProBaseActivity<T extends BaseViewModel> extends BaseActivity{
    private T mViewModel;

}
