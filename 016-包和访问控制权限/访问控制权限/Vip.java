package com.bjpowernode3; // 包变化了。

// 导入
import com.bjpowernode.User;

// User在com.bjpowernode包下。
// Vip在com.bjpowernode3包下。
// User和Vip不在同一个包下。
// 但是Vip是User的子类。
public class Vip extends User{

	//实例方法
	public void shopping(){
		// this表示当前对象
		// protected可以
		System.out.println(this.age);
		// 错误：默认 不行。
		//System.out.println(this.name);
	}

}