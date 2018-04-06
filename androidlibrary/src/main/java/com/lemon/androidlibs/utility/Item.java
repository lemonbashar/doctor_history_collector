package com.lemon.androidlibs.utility;

/**
 * Created by lemon on 2/17/2018.
 */

@SuppressWarnings("DefaultFileTemplate")
public class Item {
    public final Long primaryKey;
    public final String title;
    public final String description;
    public final String searchable;

    public Item(Long primaryKey, String title, String description) {
        this.primaryKey = primaryKey;
        this.title = title;
        this.description = description;
        this.searchable=title.toLowerCase();
    }

    @Override
    public String toString() {
        return "Item{" +
                "primaryKey=" + primaryKey +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}