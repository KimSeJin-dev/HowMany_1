package com.example.howmany;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

public class PostItem {
//    private Drawable id; // 번호
    private String name; // 분반
    private String major; // 학수번호
    private String enter_time; // 수업이름
    private String phone_num;

    public PostItem(){}

//    public void setId(Drawable id) { this.id = id; }

    public PostItem(String name, String major, String enter_time, String phone_num){
//        this.id = id;
        this.name = name;
        this.major = major;
        this.enter_time = enter_time;
        this.phone_num = phone_num;
    }
//    public Drawable getId() {return id;}
    public String getPhone_num(){return phone_num;}
    public String getName() {return name;}
    public String getMajor() { return major;}
    public String getEnter_time() {
        return enter_time;
    }
}
