package com.easier.ethiopaysdk;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface AngolaRequest {

    // 填上需要访问的服务器地址
    String TEST_HOST = "http://amm.easier.cn/service-openup/";

//    String TEST_HOST = "http://196.188.120.3:10443/service-openup/";

    String HOST = "http://app.ethiomobilemoney.et:2121/";

    @POST("toTradeSDKPay")
    Observable<TradeWebPayResponse> toTradeWebPay(@Body TradeSDKPayRequest request);


}
