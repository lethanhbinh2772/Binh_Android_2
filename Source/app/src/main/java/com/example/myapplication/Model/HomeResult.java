package com.example.myapplication.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeResult {

@SerializedName("customerDetail")
@Expose
private CustomerDetail customerDetail;
@SerializedName("listNews")
@Expose
private List<News> listNews = null;
@SerializedName("listPromotion")
@Expose
private List<Promotion> listPromotion = null;

public CustomerDetail getCustomerDetail() {
return customerDetail;
}

public void setCustomerDetail(CustomerDetail customerDetail) {
this.customerDetail = customerDetail;
}

public List<News> getListNews() {
return listNews;
}

public void setListNews(List<News> listNews) {
this.listNews = listNews;
}

public List<Promotion> getListPromotion() {
return listPromotion;
}

public void setListPromotion(List<Promotion> listPromotion) {
this.listPromotion = listPromotion;
}

}
