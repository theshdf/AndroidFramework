package fun.shdf.java_aac.Base.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import fun.shdf.java_aac.Base.model.BaseReposity;

/**
 * code-time: 2018/9/20
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:通用的viewmodel,由于view和viewmodel分离
 * viewmodel中无法使用context，如果viewmodel要使用context，继承androidVM即可
 **/
public class BaseViewModel<T extends BaseReposity> extends AndroidViewModel{

    protected T mReposity;


    /**
     * 可以引入application，并且完成初始化工作
     * @param application
     */
    public BaseViewModel(@NonNull Application application) {
        super(application);
    }
}
