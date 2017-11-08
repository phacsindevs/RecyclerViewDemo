package com.phacsin.recyclerviewdemo;

/**
 * Created by sachin on 17/10/17.
 */

public class ListItem {
    String title,subtitle;

    // Public Constructor
    ListItem(String title,String subtitle)
    {
        this.title = title;
        this.subtitle = subtitle;
    }

    // Accessor methods

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
