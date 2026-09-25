package com.abispring.demoproject;

public class Person {
private String sname;
private int age;
public Person(String sname, int age) {
	this.sname = sname;
	this.age = age;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
