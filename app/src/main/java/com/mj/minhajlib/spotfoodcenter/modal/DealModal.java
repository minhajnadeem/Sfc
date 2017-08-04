package com.mj.minhajlib.spotfoodcenter.modal;

/**
 * Created by Minhaj lib on 7/15/2017.
 */

public class DealModal {

    private String dealNo,dealName,dealPrice;

    public DealModal(String dealNo,String dealName,String dealPrice){

        setDealNo(dealNo);
        setDealName(dealName);
        setDealPrice(dealPrice);
    }

    public String getDealNo() {
        return dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(String dealPrice) {
        this.dealPrice = dealPrice;
    }
}
