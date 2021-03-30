
/*
	实例的：一定需要使用“引用.”来访问。

	静态的：
		建议使用“类名.”来访问，但使用“引用.”也行（不建议使用"引用."）。
		静态的如果使用“引用.”来访问会让程序员产生困惑：程序员以为是实例的呢。
	
	结论：
		空指针异常只有在什么情况下才会发生呢?
			只有在“空引用”访问“实例”相关的，都会出现空指针异常。
*/
public class StaticTest03{
	public static void main(String[] args){
		// 通过"类名."的方式访问静态变量
		System.out.println(Chinese.country);
		// 创建对象
		Chinese c1 = new Chinese("1111111", "张三");
		System.out.println(c1.idCard); // 1111111
		System.out.println(c1.name); // 张三
		System.out.println(c1.country); // 中国

		// c1是空引用
		c1 = null;
		// 分析这里会不会出现空指针异常？
		// 不会出现空指针异常。
		// 因为静态变量不需要对象的存在。
		// 实际上以下的代码在运行的时候，还是：System.out.println(Chinese.country);
		System.out.println(c1.country);

		// 这个会出现空指针异常，因为name是实例变量。
		//System.out.println(c1.name);
	}
}

class Chinese{

	// 实例变量
	String idCard;
	String name;

	// 静态变量
	static String country = "中国";

	//构造方法
	public Chinese(String x, String y){
		idCard = x;
		name = y;
	}
}