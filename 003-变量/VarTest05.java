
// 编译报错：i变量重复定义了。（和类型没有关系。不能同名。）
public class VarTest05{
	public static void main(String[] args){

		// 整数型
		int i = 100;	

		System.out.println(i);

		// 浮点型（带小数的）
		// 错误: 已在方法 main(String[])中定义了变量 i
		double i = 1.2;

		System.out.println(i);

	}
}