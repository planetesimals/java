/*
根据指定月份，打印该月份所属的季节。
	3,4,5 春季 
	6,7,8 夏季 
	9,10,11 秋季 
	12, 1, 2 冬季

	if和switch各写一版
*/
class Homework1{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入合法的数字【该数字可以是：1 2 3 4 5 6 7 8 9 10 11 12】:");
		int i = s.nextInt();

		// if版本
		/*
		String str = "输入的数字不合法";
		if(i == 3 || i == 4 || i == 5){
			str = "春季";
		}else if(i == 6 || i == 7 || i == 8){
			str = "夏季";
		}else if(i == 9 || i == 10 || i == 11){
			str = "秋季";
		}else if(i == 12 || i == 1 || i == 2){
			str = "冬季";
		}
		System.out.println(str);
		*/

		// switch版本
		String str = "输入的数字不合法";
		switch(i){
		case 3:case 4:case 5:
			str = "春季";
			break;
		case 6:case 7:case 8:
			str = "夏季";
			break;
		case 9:case 10:case 11:
			str = "秋季";
			break;
		case 12:case 1:case 2:
			str = "冬季";
		}
		System.out.println(str);

	}
}

//从键盘接收一个数字，判断该数字的正负
class Homework2{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个数字，我可以判断正负哦：");
		// 接收一个数字
		//int value = s.nextInt();
		double value = s.nextDouble();
		// 判断该数字正负
		/*
		if(value < 0){
			System.out.println("负数");
		}else{
			System.out.println("正数");
		}
		*/
		System.out.println(value < 0 ? "负数" : "正数");
	}
}

//从键盘接收一个数字，判断该数字的奇偶。
class Homework3{
	public static void main(String[] args){
		
		//创建一次。
		java.util.Scanner s = new java.util.Scanner(System.in);

		while(true){
			System.out.print("请输入一个数字，可以判断奇数偶数哦（输入0表示退出系统）：");
			int value = s.nextInt();
			if(value == 0){
				// 退出系统，结束程序
				return; //后面讲。
			}
			System.out.println(value % 2 == 0 ? "偶数" : "奇数");
		}
	}
}

/*
整数大小比较：输入两个整数，比较大小，
	若x>y 输出 >
	若x=y 输出 =
	若x<y 输出 <
*/
class Homework4{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入第1个数字：");
		int x = s.nextInt();
		System.out.print("请输入第2个数字：");
		int y = s.nextInt();
		if(x > y){
			System.out.println(x + ">" + y);
		}else if(x == y){
			System.out.println(x + "=" + y);
		}else{
			System.out.println(x + "<" + y);
		}
		// 同学们尝试一下使用多个三目运算符如何表述以上程序。
	}
}


/*
编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
使用if-else结构，并按从小到大的顺序输出
*/
class Homework5{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入第1个数字：");
		int x = s.nextInt();
		System.out.print("请输入第2个数字：");
		int y = s.nextInt();
		System.out.print("请输入第3个数字：");
		int z = s.nextInt();

		// 先判断三个值是否都相等
		if(x == y && y == z){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			return; //终止掉程序，后面讲
		}

		// 代码能够走到这里说明x y z不是都相等。
		// x和y相等，但是和z不等 
		if(x == y){
			if(x > z){
				System.out.println(z);
				System.out.println(x);
				System.out.println(y);
			}else{
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		// x和z相等，但是和y不等
		if(x == z){ 
			if(x > y){
				System.out.println(y);
				System.out.println(x);
				System.out.println(z);
			}else{
				System.out.println(x);
				System.out.println(z);
				System.out.println(y);
			}
		}
		// y和z相等，但是和x不等
		if(y == z){ // x y z
			if(y > x){
				System.out.println(x);	
				System.out.println(y);	
				System.out.println(z);	
			}else{
				System.out.println(y);	
				System.out.println(z);	
				System.out.println(x);
			}
		}

		// 程序执行到这里说明 x y z 都不相等
		/*
		if(x > y){
			if(y > z){
				System.out.println(z);
				System.out.println(y);
				System.out.println(x);
			}else{ 
				if(x < z){
					System.out.println(y);
					System.out.println(x);
					System.out.println(z);
				}else{
					System.out.println(y);
					System.out.println(z);
					System.out.println(x);
				}
			}
		}else{
			// x < y
			// 50 < 100
		}
		*/

		// 不算相等的，一共有6种情况。
		if(x > y && x > z){ // 假设x是最大的
			if(y > z){
				System.out.println(z);
				System.out.println(y);
			}else{
				System.out.println(y);
				System.out.println(z);
			}
			System.out.println(x);
		}else if(y > x && y > z){ // 假设y是最大的
			if(x > z){
				System.out.println(z);
				System.out.println(x);
			}else{
				System.out.println(x);
				System.out.println(z);
			}
			System.out.println(y);
		}else{ //假设z是最大的
			if(x > y){
				System.out.println(y);
				System.out.println(x);
			}else{
				System.out.println(x);
				System.out.println(y);
			}
			System.out.println(z);
		}
		

	}
}

/*
打车起步价8元（3KM以内）
超过3KM，超出的每公里1.2元
超过5KM，超出的每公里1.5元
请在键盘上接收公里数，得出总价。
*/
class Homework6{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入行驶的公里数：");
		int dis = s.nextInt(); 
		if(dis <= 3){
			System.out.println("总价是：" + 8 + "元");
		}else if(dis <= 5){
			System.out.println("总价是：" + ((dis - 3) * 1.2 + 8) + "元");
		}else{
			// 公里超出5KM
			System.out.println("总价是：" + ((8 + 2 * 1.2) + (dis - 5) * 1.5) + "元");
		}
	}
}