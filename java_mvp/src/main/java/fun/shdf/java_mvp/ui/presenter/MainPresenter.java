package fun.shdf.java_mvp.ui.presenter;

import fun.shdf.java_mvp.base.BasePresenter;
import fun.shdf.java_mvp.base.BaseView;
import fun.shdf.java_mvp.ui.contract.MainContract;
import fun.shdf.java_mvp.ui.model.RegistModelImpl;

/**
 * code-time: 2018/9/5
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public  class MainPresenter implements MainContract.Presenter<String> {
    private RegistModelImpl registModel;

    public MainPresenter(){
        registModel = new RegistModelImpl(this);
    }

    public void regist(){
        registModel.regist("1","1","1");
    }


    @Override
    public void success(String data) {

    }

    @Override
    public void fail(java.lang.String msg) {

    }

    @Override
    public void error(java.lang.String msg) {

    }
}
