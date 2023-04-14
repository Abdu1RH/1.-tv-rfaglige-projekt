package com.example.noteappabdu1rh;

public class Note {

    private String username;

    private String title;
    private String text;
    private String tag;
    private boolean isFavorite;

    public Note(String username,String title, String text, String tag, boolean isFavorite) {
        this.title = title;
        this.text = text;
        this.tag = tag;
        this.isFavorite = isFavorite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
