package com.example.seguimienot13.model;

public class safeData {

    private static safeData instance;

    private String password = "000000";
    private String content;

    private safeData(){
    }

    public static safeData getInstance(){
        if(instance == null){
            instance = new safeData();
        }
        return instance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
