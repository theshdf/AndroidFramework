package fun.shdf.java_mvp.base;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public interface BaseView<T,E> {
    void setPresenter(E presenter);
    void  success(T data);
    void fail(String msg);
    void error(String msg);
}
