package com.chainsys.practice;

public class Streams 
{
	String name;
	int age;
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
	@Override
	public String toString() {
		return "Streams [name=" + name + ", age=" + age + "]";
	}
	
	public Streams(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
}