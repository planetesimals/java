
/*
从控制台接收一个正整数，判断该数字是否为质数
质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）

因数是什么？
	3 * 5 = 15
	3和5都是15的因数。

2 3 4 5 6 7中：2 3 5 7都是质数。

重点题目：
	主要练习，在外部打布尔标记。

*/
public class Homework4{
	public static void main(String[] args){
		// 从控制台接收一个正整数。
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = s.nextInt(); // 假设输入的是8

		// 判断该数字是否为质数
		// 怎么判断num是不是质数
		// 怎么判断8是不是质数？
		// 思路：8除以2看看能不能整除、8除以3看看能不能整除、8除以4看看能不能整除
		// 一直除下去，直到发现有能够整除的，表示该数一定不是质数。
		/*
			假设输入的是7：
				7 / 1 不用判断
				7 / 2	需要判断
				7 / 3	需要判断
				7 / 4	需要判断（假设这个判断，发现可以整除，就没必要往下判断了。）
				7 / 5	需要判断
				7 / 6	需要判断
				7 / 7 不用判断
		*/

		//可以考虑在外边准备一个布尔类型的标记。
		boolean zhiShu = true; // true表示是质数。

		for(int i = 2; i < num; i++){ // 假设输入的是100
			//System.out.println(i);
			if(num % i == 0){
				// 循环没必要执行了，为了效率，这里要终止循环
				//System.out.println("该数字"+num+"不是质数！");
				zhiShu = false;
				break;
			}
		}

		System.out.println(num + (zhiShu ? "是" : "不是") + "质数");
	}
}