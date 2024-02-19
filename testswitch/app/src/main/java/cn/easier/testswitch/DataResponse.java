package cn.easier.testswitch;

import com.google.gson.annotations.SerializedName;

class DataResponse {

   @SerializedName("toPayUrl")
   private String toPayUrl;


    private String transactionNo;

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }


    public String getToPayUrl() {
       return toPayUrl;
   }

   public void setToPayUrl(String toPayUrl) {
       this.toPayUrl = toPayUrl;
   }
}
