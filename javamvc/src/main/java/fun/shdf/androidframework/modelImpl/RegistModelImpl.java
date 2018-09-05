package fun.shdf.androidframework.modelImpl;
import fun.shdf.androidframework.Base.BaseHttpInterface;
import fun.shdf.androidframework.Base.BaseResponse;
import fun.shdf.androidframework.http.HttpRequest;
import fun.shdf.androidframework.model.RegistModel;
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
    @Override
    public void regist(String username, String pass, String confimpass, BaseHttpInterface listener) {
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
                        listener.success(baseResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.fail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }
}
