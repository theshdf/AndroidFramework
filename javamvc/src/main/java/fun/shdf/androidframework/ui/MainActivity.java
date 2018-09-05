package fun.shdf.androidframework.ui;
import android.widget.TextView;
import fun.shdf.androidframework.Base.BaseActivity;
import fun.shdf.androidframework.Base.BaseResponse;
import fun.shdf.androidframework.R;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public class MainActivity extends BaseActivity<BaseResponse> {
    //TextView tv;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
     //   tv = this.findViewById(R.id.tv_content);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void success(BaseResponse data) {

    }

    @Override
    public void fail(String msg) {

    }
}
