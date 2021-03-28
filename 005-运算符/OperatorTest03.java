
/*
	逻辑运算符：
		&	逻辑与（可以翻译成并且）
		|	逻辑或（可以翻译成或者）
		!	逻辑非（取反）
		&&	短路与
		||	短路或
	
	用普通话描述的话：100 大于 99 并且 100 大于 98 ，有道理
	用代码描述的话：100 > 99 & 100 > 98 --> true

	true & true --> true

	非常重要：
		逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型。
		这是逻辑运算符的特点。
	
	100 & true 不行，语法错误。
	100 & 200 不行，没有这种语法。
	true & false 这样可以。

	100 > 90 & 100 > 101 --> false

	& 两边都是true，结果才是true
	| 有一边是true，结果就是true

*/	
public class OperatorTest03{
	public static void main(String[] args){
		// 对于逻辑与&运算符来说，只要有一边是false，结果就是false。
		// 只有两边同时为true，结果才是true。
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & false); // false

		System.out.println(100 > 90 & 100 > 101); // false
		System.out.println((100 > 90) & (100 > 101)); // false

		int a = 100;
		int b = 101;
		int c = 90;
		System.out.println(a < b & a > c); // true

		// 对于逻辑或呢？
		// 只要有一边是true，结果就是true。
		System.out.println(a < b | c > b); // true
		System.out.println(true | false); // true

		System.out.println(true | true); // true
		System.out.println(false | false); // false

		System.out.println(!false); // true
		System.out.println(!true); // false

		// 注意：这里需要加一个小括号。
		System.out.println(!(a > b)); // true

		/*
			关于短路与 &&，短路或 ||
			其中重点学习短路与，短路或照葫芦画瓢。

			短路与&& 和 逻辑与 &有什么区别？
				首先这两个运算符的运算结果没有任何区别，完全相同。
				只不过“短路与&&”会发生短路现象。

			什么是短路现象呢？
				右边表达式不执行，这种现象叫做短路现象。

			什么时候使用&&，什么时候使用& ？
				从效率方面来说，&&比&的效率高一些。
				因为逻辑与&不管第一个表达式结果是什么，第二个表达式一定会执行。

				以后的开发中，短路与&&和逻辑与还是需要同时并存的。
					大部分情况下都建议使用短路与&&
					只有当既需要左边表达式执行，又需要右边表达式执行的时候，才会
					选择逻辑与&。
		*/

		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & false); // false

		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false); // false

		// 接下来需要理解一下什么是短路现象，什么时候会发生“短路”。
		int x = 10;
		int y = 11;
		// 逻辑与&什么时候结果为true（两边都是true，结果才是true）
		// 左边的 x>y 表达式结果已经是false了，其实整个表达式的结
		// 果已经确定是false了，按道理来说右边的表达式不应该执行。
		System.out.println(x > y & x > y++); 

		// 通过这个测试得出：x > y++ 这个表达式执行了。
		System.out.println(y); // 12

		//测试短路与&&
		int m = 10;
		int n = 11;
		// 使用短路与&&的时候，当左边的表达式为false的时候，右边的表达式不执行
		// 这种现象被称为短路。
		System.out.println(m > n && m > n++);
		System.out.println(n); // 11

		// 问题：什么时候发生短路或现象？
		// || 短路或
		// “或”的时候只要有一边是true，结果就是true。
		// 所以，当左边的表达式结果是true的时候，右边的表达式不需要执行，此时会短路。

	}
}