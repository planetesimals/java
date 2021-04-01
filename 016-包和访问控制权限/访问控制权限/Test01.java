package com.bjpowernode;

public class Test01{

	public static void main(String[] args){
		User user = new User();

		// private修饰的元素只能在本类中用。
		//System.out.println(user.id);
		System.out.println(user.age);
		System.out.println(user.weight);
		System.out.println(user.name);
	}
}
