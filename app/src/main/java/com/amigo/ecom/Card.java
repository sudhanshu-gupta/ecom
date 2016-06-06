package com.amigo.ecom;

/**
 * Created by sudhanshu.gupta on 11/01/16.
 */
public class Card {
    private String text;
	private String backupText;
    private int imageLink;
    private String appLink;

    public Card(String text, int imageLink, String appLink) {
        this.text = text;
		this.backupText = text;
        this.imageLink = imageLink;
        this.appLink = appLink;
    }

    public String getAppLink() {
        return appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public int getImageLink() {
        return imageLink;
    }

    public void setImageLink(int imageLink) {
        this.imageLink = imageLink;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("appLink='").append(appLink).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", imageLink='").append(imageLink).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
