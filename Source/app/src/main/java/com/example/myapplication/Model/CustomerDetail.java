package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerDetail {

    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("point")
    @Expose
    private Integer point;
    @SerializedName("isNeedUpdate")
    @Expose
    private Integer isNeedUpdate;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getIsNeedUpdate() {
        return isNeedUpdate;
    }

    public void setIsNeedUpdate(Integer isNeedUpdate) {
        this.isNeedUpdate = isNeedUpdate;
    }

}
