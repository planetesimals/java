/*
	业务要求：
		1、从键盘上接收一个人的年龄。
		2、年龄要求为[0-150]，其它值表示非法，需要提示非法信息。
		3、根据人的年龄来动态的判断这个人属于生命的哪个阶段？
			[0-5] 婴幼儿
			[6-10] 少儿
			[11-18] 少年
			[19-35] 青年
			[36-55] 中年
			[56-150] 老年
		4、请使用if语句完成以上的业务逻辑。
*/
public class IfTest02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = s.nextInt();
		//System.out.println("测试以下，您输入的年龄是：" + age);
		/*
		if(age < 0 || age > 150){
			System.out.println("对不起，年龄值不合法");
		} else {
			// 能够走到这个分支当中，说明年龄是合法的。
			// 可以进一步使用嵌套的if语句进行判断。
			//if(age >= 0 && age <= 5){}
			// 当前先使用if嵌套的方式，当然，嵌套不是必须的。可以有其它写法。
			//System.out.println("年龄值合法");
			// 年龄值合法的情况下，继续判断年龄属于哪个阶段的！！！！
			//if(age >= 0 && age <= 5){} // 这样写代码比较啰嗦了。
			if(age <= 5){
				System.out.println("婴幼儿");
			} else if(age <= 10){
				System.out.println("少儿");
			} else if(age <= 18){
				System.out.println("少年");
			} else if(age <= 35){
				System.out.println("青年");
			} else if(age <= 55){
				System.out.println("中年");
			} else {
				System.out.println("老年");
			}
		}
		*/

		// 可以不嵌套吗？可以
		/*
		if(age < 0 || age > 150){
			System.out.println("对不起，年龄值不合法");
		} else if(age <= 5){
			System.out.println("婴幼儿");
		} else if(age <= 10){
			System.out.println("少儿");
		} else if(age <= 18){
			System.out.println("少年");
		} else if(age <= 35){
			System.out.println("青年");
		} else if(age <= 55){
			System.out.println("中年");
		} else {
			System.out.println("老年");
		}
		*/

		// 进一步改良
		String str = "老年"; // 字符串变量默认值是“老年”
		if(age < 0 || age > 150){
			System.out.println("对不起，年龄值不合法");
			// 既然不合法，你就别让程序往下继续执行了，怎么终止程序执行
			//return;
		} else if(age <= 5){
			str = "婴幼儿";
		} else if(age <= 10){
			str = "少儿";
		} else if(age <= 18){
			str = "少年";
		} else if(age <= 35){
			str = "青年";
		} else if(age <= 55){
			str = "中年";
		} 
		System.out.println(str);
	
		// 对于初学者来说可能代码会写成这样，这是正常的。
		// 代码的经验需要一步一步的积累，慢慢的代码就会越来越漂亮了。
		// 需要时间，需要积累代码经验。最好的代码是：最少的代码量，最高的效率。
		/*
		if(age >= 0 && age <= 5){
		
		}else if(age >= 6 && age <= 10){
		
		}else if.....
		*/

	}
}