package fun.shdf.java_mvvm.bean;

import java.io.Serializable;

/**
 * code-time: 2018/9/5
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public class User implements Serializable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
