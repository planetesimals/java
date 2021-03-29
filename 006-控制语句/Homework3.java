//从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
public class Homework3{
	public static void main(String[] args){
		//第一步：怎么从键盘上接收一个正整数。
		java.util.Scanner s = new java.util.Scanner(System.in);
		// 等待用户输入一个正整数。
		System.out.print("请输入一个正整数：");
		int num = s.nextInt();
		// 计算该数的阶乘
		// 5的阶乘：5*4*3*2*1
		// 8的阶乘：8*7*6*5*4*3*2*1
		// 第二步：先不用管乘法的事儿，先实现从8取到1.（递减的方式取）
		//int jieGuo = 0; //初始值不能是0，是0的时候，乘积最后是0.
		int jieGuo = 1; //结果的初始值给1.
		for(int i = num; i > 1; i--){
			jieGuo *= i; // jieGuo = jieGuo * i;
		}
		System.out.println("计算结果 = " + jieGuo);
	}
}