package fun.shdf.java_mvp.ui.model;
import fun.shdf.java_mvp.base.BasePresenter;
import fun.shdf.java_mvp.base.BaseResponse;
import fun.shdf.java_mvp.base.BaseView;
import fun.shdf.java_mvp.http.HttpRequest;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public class RegistModelImpl implements RegistModel{
    private BasePresenter<String> presenter;

    public RegistModelImpl(BasePresenter<String> presenter){
        this.presenter = presenter;
    }
    @Override
    public void regist(String username, String pass, String confimpass) {

        HttpRequest.getInstance()
                .regist(username,pass,confimpass)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseResponse baseResponse) {
                        if(true)
                            presenter.success("");
                        else
                            presenter.fail("");
                    }

                    @Override
                    public void onError(Throwable e) {
                        presenter.error("");
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }
}
