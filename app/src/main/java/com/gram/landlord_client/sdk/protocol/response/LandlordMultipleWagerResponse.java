package com.gram.landlord_client.sdk.protocol.response;

import com.google.gson.annotations.SerializedName;

public class LandlordMultipleWagerResponse implements Response {
    @SerializedName("MultipleNum")
    private int multipleNum;

    public LandlordMultipleWagerResponse() {
    }

    public LandlordMultipleWagerResponse(int multipleNum) {
        this.multipleNum = multipleNum;
    }

    public int getMultipleNum() {
        return multipleNum;
    }

    public void setMultipleNum(int multipleNum) {
        this.multipleNum = multipleNum;
    }
}
