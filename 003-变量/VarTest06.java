// 一行上可以同时声明多个变量吗？
// 答案：可以一行声明多个变量。
public class VarTest06{
	public static void main(String[] args){
		// 声明三个变量，都是int类型，起名a,b,c
		// 通过测试得出结论是：a,b没有赋值，c赋值100
		int a, b, c = 100;

		// 变量必须先声明，再赋值，才能访问，a,b两个变量赋值了吗？
		//错误: 可能尚未初始化变量a
		//System.out.println(a);
		//错误: 可能尚未初始化变量b
		//System.out.println(b);
		System.out.println(c);

		// 给a赋值
		a = 200;
		// 给b赋值
		b = 300;
		System.out.println(a);
		System.out.println(b);
		
	}
}