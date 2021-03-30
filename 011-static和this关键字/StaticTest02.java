/*
	什么时候变量声明为实例的，什么时候声明为静态的？
		如果这个类型的所有对象的某个属性值都是一样的，
		不建议定义为实例变量，浪费内存空间。建议定义
		为类级别特征，定义为静态变量，在方法区中只保留
		一份，节省内存开销。
	
	一个对象一份的是实例变量。
	所有对象一份的是静态变量。
*/
/*
public class StaticTest02{
	public static void main(String[] args){
		Chinese c1 = new Chinese("1231456456456456","张三","中国");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c1.country);

		Chinese c2 = new Chinese("7897897896748564","李四","中国");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		System.out.println(c2.country);
	}
}

// 定义一个类：中国人
class Chinese{

	// 身份证号
	// 每一个人的身份证号不同，所以身份证号应该是实例变量，一个对象一份。
	String idCard; 

	// 姓名
	// 姓名也是一个人一个姓名，姓名也应该是实例变量。
	String name;

	// 国籍
	// 对于“中国人”这个类来说，国籍都是“中国”，不会随着对象的改变而改变。
	// 显然国籍并不是对象级别的特征。
	// 国籍属于整个类的特征。整个族的特征。
	// 假设声明为实例变量，内存图是怎样的？
	// 假设声明为静态变量，内存图又是怎样的?
	String country;

	// 无参数
	public Chinese(){
	
	}

	// 有参数
	public Chinese(String s1,String s2, String s3){
		idCard = s1;
		name = s2;
		country = s3;
	}
}
*/

public class StaticTest02{
	public static void main(String[] args){
		// 访问中国人的国籍
		// 静态变量应该使用类名.的方式访问
		System.out.println(Chinese.country);

		Chinese c1 = new Chinese("1231456456456456","张三");
		System.out.println(c1.idCard);
		System.out.println(c1.name);

		Chinese c2 = new Chinese("7897897896748564","李四");
		System.out.println(c2.idCard);
		System.out.println(c2.name);

		// idCard是实例变量，必须先new对象，通过“引用.” 访问
		// 错误: 无法从静态上下文中引用非静态 变量 idCard
		//System.out.println(Chinese.idCard);
	}
}

// 定义一个类：中国人
class Chinese{

	// 身份证号
	// 每一个人的身份证号不同，所以身份证号应该是实例变量，一个对象一份。
	String idCard; 

	// 姓名
	// 姓名也是一个人一个姓名，姓名也应该是实例变量。
	String name;

	// 国籍
	// 重点重点五颗星：加static的变量叫做静态变量
	// 静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了。
	// 静态变量存储在方法区。
	static String country = "中国";

	// 无参数
	public Chinese(){
	
	}

	// 有参数
	public Chinese(String s1,String s2){
		idCard = s1;
		name = s2;
	}
}