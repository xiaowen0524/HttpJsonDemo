package com.bawei.asus.httpjsondemo;

/**
 * Created by asus on 2016/11/4.
 */
public class Tugou {
    private String description;
    private String food;
    private String img;
    private String keywords;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tugou(String description, String food, String img, String keywords, String name) {
        this.description = description;
        this.food = food;
        this.img = img;
        this.keywords = keywords;
        this.name = name;
    }

    public Tugou(){
        super();
    }

    @Override
    public String toString() {
        return "Tugou{" +
                "description='" + description + '\'' +
                ", food='" + food + '\'' +
                ", img='" + img + '\'' +
                ", keywords='" + keywords + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
