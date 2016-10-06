package com.twitter.api.models;

/**
 * Created by Alexander on 06.10.2016.
 */
public class Tweet {
    private String id_str = "";
    private String text = "";
    private User user;

    public String getIdStr() {
        return id_str;
    }

    public void setIdStr(String id_str) {
        this.id_str = id_str;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tweet)) return false;

        Tweet tweet = (Tweet) o;

        if (id_str != null ? !id_str.equals(tweet.id_str) : tweet.id_str != null) return false;
        if (text != null ? !text.equals(tweet.text) : tweet.text != null) return false;
        return user != null ? user.equals(tweet.user) : tweet.user == null;

    }

    @Override
    public int hashCode() {
        int result = id_str != null ? id_str.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tweet{");
        sb.append("id_str='").append(id_str).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        Tweet newTweet = new Tweet();

        public Builder() {
        }

        public Builder(Tweet oldTweet) {
            if (oldTweet == null) return;
            newTweet.id_str = oldTweet.id_str;
            newTweet.text = oldTweet.text;
            newTweet.user = oldTweet.user;
        }

        public Builder setText(String text) {
            newTweet.text = text;
            return this;
        }

        public Tweet build() {
            return newTweet;
        }

    }
}
