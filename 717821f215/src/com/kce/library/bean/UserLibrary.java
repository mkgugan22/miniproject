package com.kce.library.bean;

public class UserLibrary implements Comparable{
   public String name;
   public int age;
   public String email;
   public String userId;
public UserLibrary(String name, int age, String email, String userId) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
@Override
public String toString() {
	return "UserLibrary [name=" + name + ", age=" + age + ", email=" + email + ", userId=" + userId + "]";
}
public int compareTo(Object o) {
	UserLibrary b=(UserLibrary)o;
	return this.name.compareTo(b.getName());
}
 
}
