package com.peter.tobefilledlater;

/**
 * Created by Peter on 5/21/2016.
 */
public class Joke {

    private String title;
    private String desc;

    public Joke(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
