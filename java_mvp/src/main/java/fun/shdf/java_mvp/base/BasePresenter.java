package fun.shdf.java_mvp.base;

/**
 * code-time: 2018/9/5
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public interface BasePresenter<T> {
    //todo 常用的如网络
    void  success(T data);
    void fail(String msg);
    void error(String msg);
}
