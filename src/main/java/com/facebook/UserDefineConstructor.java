package com.facebook;

public class UserDefineConstructor {
/*
 * data base can not take default value/can not be empty for id & name
 */
	int id;
	public UserDefineConstructor(int id, String name, String sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
		System.out.println(id+" "+name+ " "+sub);
	}



	String name;
	String sub;
	public UserDefineConstructor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	System.out.println(id+" "+name);
	
}

	
	
	public static void main(String[] args) {
		UserDefineConstructor uc=new UserDefineConstructor(1, "sumon","java");
	}

}
