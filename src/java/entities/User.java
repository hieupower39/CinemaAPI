/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
/**
 *
 * @author hieup
 */
public class User implements Serializable{
    private String user;
    private int age;
    
    public User(String user, int age) {
        this.user = user;
        this.age = age;
    }

    public User() {
    }
    
    
    public String getUser() {
        return user;
    }

    public int getAge() {
        return age;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    

    
}
