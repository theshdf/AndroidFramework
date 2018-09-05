package fun.shdf.java_mvp.ui.contract;

import fun.shdf.java_mvp.base.BasePresenter;
import fun.shdf.java_mvp.base.BaseView;

/**
 * code-time: 2018/9/5
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public interface MainContract {
    interface  View<T> extends BaseView<T,Presenter>{

    }
    interface Presenter<T> extends BasePresenter<T>{
        void regist();
  }
}
