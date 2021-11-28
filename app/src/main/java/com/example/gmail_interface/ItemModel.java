package com.example.gmail_interface;

public class ItemModel {
    private String senderName;
    private String title;
    private String content;
    private String timeReceive;
    private boolean selected;
    private int color;

    public ItemModel(String senderName, String title, String content, String timeReceive, int color) {
        this.senderName = senderName;
        this.title = title;
        this.content = content;
        this.timeReceive = timeReceive;
        this.selected = false;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
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

    public String getTimeReceive() {
        return timeReceive;
    }

    public void setTimeReceive(String timeReceive) {
        this.timeReceive = timeReceive;
    }
}
