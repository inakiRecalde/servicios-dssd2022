package com.materiales.servicioMateriales.models;

public class User {
    private String user;
    private String pwd;
    private String token;

    public User() {  }
    
    public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUser() {
        return user;
    }
    public void setUser(String username) {
        this.user = username;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }


}
