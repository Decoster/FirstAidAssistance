package com.vanhamme.jh.test1;

/**
 * Created by JHVANHAMME on 15/10/2015.
 * DTO for user database.
 */
public class User {

    private int id;
    private String login;
    private String password;

    public User(){}

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int myId){
        this.id = myId;
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String myPassword){
        this.login = myPassword;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String myPassword){
        this.password = myPassword;
    }

    public String toString(){
        return id + ", " + login + ", " + password;
    }
}
