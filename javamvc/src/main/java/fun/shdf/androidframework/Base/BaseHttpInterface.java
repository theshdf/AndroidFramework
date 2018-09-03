package fun.shdf.androidframework.Base;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public interface BaseHttpInterface<T> {
    void success(T data);
    void fail(String msg);
}
