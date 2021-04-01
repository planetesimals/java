package com;

// 将需要的类导入。
//import com.bjpowernode.javase.chapter17.HelloWorld;
import com.bjpowernode.javase.chapter17.*;

public class Test02{
	public static void main(String[] args){
		/*
			Test02在com包下。
			HelloWorld在com.bjpowernode.javase.chapter17下。
			不在同一个package下，包名可以省略吗？
				不能省略。
		*/
		//错误: 找不到符号
		/*
		HelloWorld hw = new HelloWorld();
		System.out.println(hw);
		*/

		/*
		com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();
		System.out.println(hw);

		com.bjpowernode.javase.chapter17.HelloWorld hw2 = new com.bjpowernode.javase.chapter17.HelloWorld();
		System.out.println(hw2);

		com.bjpowernode.javase.chapter17.HelloWorld hw3 = new com.bjpowernode.javase.chapter17.HelloWorld();
		System.out.println(hw3);
		*/

		HelloWorld hw1 = new HelloWorld();
		System.out.println(hw1);

		HelloWorld hw2 = new HelloWorld();
		System.out.println(hw2);
	}
}
