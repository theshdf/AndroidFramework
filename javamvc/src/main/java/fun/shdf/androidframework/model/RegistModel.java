package fun.shdf.androidframework.model;

import fun.shdf.androidframework.Base.BaseHttpInterface;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public interface RegistModel {
    void regist(String username, String pass, String confimpass, BaseHttpInterface listener);
}
