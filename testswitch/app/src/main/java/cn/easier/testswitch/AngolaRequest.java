package cn.easier.testswitch;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface AngolaRequest {

    // 填上需要访问的服务器地址
//    String URL_HOST = "http://196.188.120.3:11443/service-openup/";

    String URL_HOST = "http://app.ethiomobilemoney.et:2121/";

    @POST("toTradeMobielPay")
    Observable<TradeWebPayResponse> toTradeWebPay(@Body TradeSDKPayRequest request);


}
