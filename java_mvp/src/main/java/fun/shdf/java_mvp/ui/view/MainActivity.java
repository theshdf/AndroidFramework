package fun.shdf.java_mvp.ui.view;
import android.os.Bundle;
import android.widget.TextView;
import fun.shdf.java_mvp.R;
import fun.shdf.java_mvp.base.BaseActivity;
import fun.shdf.java_mvp.ui.contract.MainContract;
import fun.shdf.java_mvp.ui.presenter.MainPresenter;

public class MainActivity extends BaseActivity implements MainContract.View<String>{
    private TextView tv;
    private MainContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tv = findViewById(R.id.tv);
    }

    @Override
    public void initData() {
        presenter = new MainPresenter();
        setPresenter(presenter);
    }

    @Override
    public void initListener() {
        tv.setOnClickListener(view ->{

        });
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        presenter.regist();
    }

    @Override
    public void success(String data) {

    }

    @Override
    public void fail(String msg) {

    }

    @Override
    public void error(String msg) {

    }
}
