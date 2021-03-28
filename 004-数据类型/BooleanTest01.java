/*
	1、在java语言中boolean类型只有两个值，没有其他值：
		true和false。
		不像C或者C++，C语言中1和0也可以表示布尔类型。

	2、boolean类型在实际开发中使用在哪里呢？
		使用在逻辑判断当中，通常放到条件的位置上（充当条件）
*/
public class BooleanTest01{
	public static void main(String[] args){
		//错误: 不兼容的类型: int无法转换为boolean
		//boolean xingBie = 1;

		// 需求规定：如果为true则表示男，为false则表示女。
		//boolean sex = true;
		boolean sex = false;

		int a = 10;
		int b = 20;
		System.out.println(a < b); // true
		System.out.println(a > b); // false

		//boolean flag = a < b;
		boolean flag = (a < b); // 运算符是有优先级的，不确定可以加小括号。加了小括号就一定是先执行的。
		System.out.println(flag); // true

		// 后面我们会学习if语句
		// if语句是一个条件语句
		// 可以实现什么功能呢？例如：如果A账户的钱充足，才可以向B账户转账。
		// 例如：如果这个布尔型值是true，则表示男性，为false则表示女性。
		if(sex){
			System.out.println("男");
		}else{
			System.out.println("女");
		}

		// 以上的if语句看不懂没关系。后面会学习。
	}
}