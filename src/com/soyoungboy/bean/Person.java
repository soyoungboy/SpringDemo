package com.soyoungboy.bean;

public class Person {
private String lastName;
private String firstName;
private Integer age;
private String gender;


public Person() {
	super();
}
public Person(String lastName, String firstName, Integer age, String gender) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.age = age;
	this.gender = gender;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", gender=" + gender + "]";
}

}
