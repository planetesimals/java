
/*
	条件运算符：（三目运算符。）
		语法格式：
			布尔表达式 ? 表达式1 : 表达式2

		执行原理是什么？
			布尔表达式的结果为true时，表达式1的执行结果作为整个表达式的结果。
			布尔表达式的结果为false时，表达式2的执行结果作为整个表达式的结果。
*/
public class OperatorTest05{
	public static void main(String[] args){

		// 合法的java语句
		// 表示声明一个变量，起名i
		int i = 100;

		// 这里会编译出错吗？
		// 错误: 不是语句
		// 100;

		// 错误: 不是语句
		//'男';

		boolean sex = true;
		
		// 分析以下代码是否存在语法错误？
		// 错误: 不是语句
		//sex ? '男' : '女';

		// 前面的变量的c的类型不能随意编写。
		// 最终的计算结果是字符型，所以变量也需要使用char类型。
		char c = sex ? '男' : '女';
		System.out.println(c);

		// 实际开发中不会这样，故意的
		//错误: 不兼容的类型: 条件表达式中的类型错误
		//char x = sex ? '男' : "女";
		//System.out.println(x);

		// 这样可以吗？可以
		sex = false;
		System.out.println(sex ? '男' : "女");

		//System.out.println(这里很牛，因为这里什么类型的数据都能放);
		/*
		System.out.println(100);
		System.out.println("100");
		System.out.println('a');
		*/
	}
}