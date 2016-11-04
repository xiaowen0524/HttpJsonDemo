package com.bawei.asus.httpjsondemo;

import java.util.List;

/**
 * Created by asus on 2016/11/4.
 */
public class Bean {
    private List<Tugou> tngou;

    public List<Tugou> getTugou() {
        return tngou;
    }

    public void setTugou(List<Tugou> tugou) {
        this.tngou = tugou;
    }

    public Bean(List<Tugou> tugou) {
        this.tngou = tugou;
    }

    public Bean() {
        super();
    }

    @Override
    public String toString() {
        return "Bean{" +
                "tugou=" + tngou +
                '}';
    }
}
