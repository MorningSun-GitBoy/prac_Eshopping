package com.newshopping.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
//可以自动生成getter/setter可以不写
public class User {
    // ORM
    // 将对象和表做一个映射
    /**
     * id int 
     * name varchar 
     * password varchar 
     * email varchar 
     * phone varchar 
     * question varchar 
     * answer varchar 
     * role int 
     * create_time datetime 
     * update_time datetime
     */
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String answer;
    private Integer role;
    private Timestamp create_time;
    private Timestamp update_time;

    public User() {
	super();
    }
    public User(Integer id, String name, String password, String email, String phone, String answer, Integer role,
	    Timestamp create_time, Timestamp update_time) {
	this();
	this.id = id;
	this.name = name;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.answer = answer;
	this.role = role;
	this.create_time = create_time;
	this.update_time = update_time;
    }

    /*
     * public Integer getId() { return id; }
     * 
     * public void setId(Integer id) { this.id = id; }
     * 
     * public String getName() { return name; }
     * 
     * public void setName(String name) { this.name = name; }
     * 
     * public String getPassword() { return password; }
     * 
     * public void setPassword(String password) { this.password = password; }
     * 
     * public String getEmail() { return email; }
     * 
     * public void setEmail(String email) { this.email = email; }
     * 
     * public String getPhone() { return phone; }
     * 
     * public void setPhone(String phone) { this.phone = phone; }
     * 
     * public String getAnswer() { return answer; }
     * 
     * public void setAnswer(String answer) { this.answer = answer; }
     * 
     * public Integer getRole() { return role; }
     * 
     * public void setRole(Integer role) { this.role = role; }
     * 
     * public Timestamp getCreate_time() { return create_time; }
     * 
     * public void setCreate_time(Timestamp create_time) { this.create_time =
     * create_time; }
     * 
     * public Timestamp getUpdate_time() { return update_time; }
     * 
     * public void setUpdate_time(Timestamp update_time) { this.update_time =
     * update_time; }
     */
}
