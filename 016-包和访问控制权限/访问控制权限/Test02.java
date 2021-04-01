package com.bjpowernode2; // 包变化了。

//import com.bjpowernode.*;
import com.bjpowernode.User;

public class Test02{
	public static void main(String[] args){

		User user = new User();

		// 错误：protected在这里不行。
		//System.out.println(user.age);

		// 可以：公开的，在哪都行。
		System.out.println(user.weight);

		// 错误：“默认”在这里也不行。
		//System.out.println(user.name);

	}
}