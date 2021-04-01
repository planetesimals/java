package com.bjpowernode.javase.chapter17;

public class Test01{
	public static void main(String[] args){

		// 创建HelloWorld对象
		// HelloWorld的完整类名：com.bjpowernode.javase.chapter17.HelloWorld
		com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();

		System.out.println(hw); //com.bjpowernode.javase.chapter17.HelloWorld@28a418fc

		// 包名可以省略吗？
		// 思考：这里的包名之所以可以省略，是因为HelloWorld和Test01在同一个package下。
		HelloWorld hw2 = new HelloWorld();
		System.out.println(hw2); //com.bjpowernode.javase.chapter17.HelloWorld@5305068a
	}
}