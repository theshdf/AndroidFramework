package fun.shdf.java_mvp.api;
import fun.shdf.java_mvp.base.BaseResponse;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public  interface ApiService {

    @POST(ApiPath.APP_REGIST)
    @FormUrlEncoded
    Observable<BaseResponse> regist(@Field("username") String username,
                                    @Field("password") String password,
                                    @Field("repassword") String repassword
    );
}
