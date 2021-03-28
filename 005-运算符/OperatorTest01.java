/*
	算术运算符：
		+	求和
		-	相减
		*  乘积
		/  商
		%  求余数（求模）

		++ 自加1
		-- 自减1
	
	对于++运算符来说：
		可以出现在变量前，也可以出现在变量后。
		不管出现在变量前还是后，总之++执行结束之后，变量的值一定会自加1。
	
*/
public class OperatorTest01{
	public static void main(String[] rags){
		int a = 10;
		int b = 3;
		System.out.println(a + b); // 13
		System.out.println(a - b); // 7
		System.out.println(a * b); // 30
		System.out.println(a / b); // 3
		System.out.println(a % b); // 1

		// 重点掌握 ++ 和 --
		// 这里重点讲解 ++，至于-- 大家可以照葫芦画瓢。
		// ++ 自加1（++可以出现在变量前，也可以出现在变量后。）
		int i = 10;

		// i变量自加1
		i++;

		System.out.println(i); //11

		int k = 10;
		// k变量自加1
		++k;
		System.out.println(k); //11

		// 研究：++出现在变量前和变量后有什么区别？
		// 先看++出现在变量后。
		// 语法：当++出现在变量后，会先做赋值运算，再自加1
		int m = 20;
		int n = m++;
		System.out.println(n); // 20
		System.out.println(m); // 21

		// ++出现在变量前呢？
		// 语法规则：当++出现在变量前的时候，会先进行自加1的运算，然后再赋值。
		int x = 100;
		int y = ++x;
		System.out.println(x); // 101
		System.out.println(y); // 101

		// 题目
		int c = 90;
		System.out.println(c++);  // 传，这个“传”在这里有一个隐形的赋值运算。90
		// 把上面代码拆解开
		//int temp = c++;
		//System.out.println(temp);

		System.out.println(c); // 91

		int d = 80;
		System.out.println(++d); //81
		// 拆解
		//int temp2 = ++d;
		//System.out.println(temp2);

		System.out.println(d); // 81

		/*
		int e = 1;
		int f = e; // e赋值给f，表示将e“传”给了f
		*/

		// 自己测试以下 -- 运算符。

	}
}