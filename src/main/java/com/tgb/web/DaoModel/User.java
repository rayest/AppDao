package com.tgb.web.DaoModel;

/**
 * Created by Administrator on 2016/5/25 0025.
 */
public class User {
    private int id;
    private String name;
    private String password;

    public User(){

    }

    public User(String name, String password){
        super();
        this.name = name;
        this.password = password;
    }

    public User(int id, String name, String password){
        super();
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
