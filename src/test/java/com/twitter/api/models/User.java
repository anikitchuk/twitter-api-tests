package com.twitter.api.models;

/**
 * Created by Alexander on 06.10.2016.
 */
public class User {
    private String id_str = "";
    private String screen_name = "";

    public String getIdStr() {
        return id_str;
    }

    public void setIdSstr(String id_str) {
        this.id_str = id_str;
    }

    public String getScreenName() {
        return screen_name;
    }

    public void setScreenName(String screen_name) {
        this.screen_name = screen_name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id_str='").append(id_str).append('\'');
        sb.append(", screen_name='").append(screen_name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id_str != null ? !id_str.equals(user.id_str) : user.id_str != null) return false;
        return screen_name != null ? screen_name.equals(user.screen_name) : user.screen_name == null;

    }

    @Override
    public int hashCode() {
        int result = id_str != null ? id_str.hashCode() : 0;
        result = 31 * result + (screen_name != null ? screen_name.hashCode() : 0);
        return result;
    }
}
