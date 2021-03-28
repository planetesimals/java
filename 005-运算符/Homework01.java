
// 大家讨论最多的一个问题。
// 如果只是针对于面试题的话，建议死记硬背。
public class Homework01{
	public static void main(String[] args){
		int i = 10;
		i = i++;
		// 大部分同学都会认为这个i一定是11
		// 这个i变量最终的结果是10（惊讶）
		// 首先，第一点：这种代码以后不会有人写。
		// 其次：第二点：没必要讨论这个问题，因为在C++中运行结果确实是11.
		// java中运行结果是10
		// c++中运行结果是11
		// 为什么？因为java和c++的编译器是不同的人开发的。原理不同。
		System.out.println(i);
		
		// 在java语言中i++，这种表达式在执行的时候，会提前先将i变量找一个临时
		// 变量存储一下。(C++中并没有这样做。)
		/*
		int k = 10;
		k = k++;
		*/
		int k = 10;
		// k = k++;对应的是下面三行代码
		int temp = k;
		k++;
		k = temp;
		System.out.println(k);
	}
}