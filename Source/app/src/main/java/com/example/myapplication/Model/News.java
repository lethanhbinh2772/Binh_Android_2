package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

@SerializedName("newsID")
@Expose
private Integer newsID;
@SerializedName("urlImage")
@Expose
private String urlImage;
@SerializedName("type")
@Expose
private Integer type;
@SerializedName("title")
@Expose
private String title;
@SerializedName("content")
@Expose
private String content;
@SerializedName("createDate")
@Expose
private String createDate;
@SerializedName("createDateStr")
@Expose
private String createDateStr;

public Integer getNewsID() {
return newsID;
}

public void setNewsID(Integer newsID) {
this.newsID = newsID;
}

public String getUrlImage() {
return urlImage;
}

public void setUrlImage(String urlImage) {
this.urlImage = urlImage;
}

public Integer getType() {
return type;
}

public void setType(Integer type) {
this.type = type;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getContent() {
return content;
}

public void setContent(String content) {
this.content = content;
}

public String getCreateDate() {
return createDate;
}

public void setCreateDate(String createDate) {
this.createDate = createDate;
}

public String getCreateDateStr() {
return createDateStr;
}

public void setCreateDateStr(String createDateStr) {
this.createDateStr = createDateStr;
}

}
