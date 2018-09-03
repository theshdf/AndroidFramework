package fun.shdf.androidframework.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public abstract class BaseActivity<T> extends AppCompatActivity implements BaseHttpInterface<T>{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
        initListener();
    }

    public abstract int getLayoutId();

    public abstract void initView();
    public abstract void initData();
    public abstract void initListener();
}
