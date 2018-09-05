package fun.shdf.java_mvp.http;

import fun.shdf.java_mvp.api.ApiConstant;
import fun.shdf.java_mvp.api.ApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * code-time: 2018/9/3
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp:
 **/
public class HttpRequest {

    private static ApiService apiService;
    static class HttpClient {
        private static final HttpRequest httpClient = new HttpRequest();
    }
    public static ApiService getInstance(){
        HttpRequest request = HttpClient.httpClient;
        return apiService;
    }
    private HttpRequest(){
        //todo 初始化retrofit
    //    client.networkInterceptors().add(null);
        apiService = new Retrofit
                .Builder()
                .client(client)
                .baseUrl(ApiConstant.URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService.class);

    }
    private OkHttpClient client = new OkHttpClient();
}
