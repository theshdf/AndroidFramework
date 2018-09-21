package fun.shdf.java_aac.ui;
import android.text.TextUtils;
import android.widget.Toast;
import fun.shdf.java_aac.base.view.ProBaseActivity;
import fun.shdf.java_aac.R;

/**
 * code-time: 2018/9/21 10:47
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public class HomeActivity extends ProBaseActivity<HomeViewModel> {
    @Override
    protected void initIntent() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        initInstance();
        //todo 获取数据
        mViewModel.bind().observe(this, str ->{
                    if(!TextUtils.isEmpty(str))
                        Toast.makeText(HomeActivity.this,str,Toast.LENGTH_SHORT).show();
        }
        );
        mViewModel.getHomeData("shdf","shdf");
    }
}
