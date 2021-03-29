
/*
	对象的创建和使用。
*/
public class XueShengTest{
	public static void main(String[] args){

		int i = 100;
		System.out.println("i = " + i);
		
		// 在这里可以访问XueSheng类吗？
		// 当然可以。
		/*
			创建对象的语法是什么？
				目前死记硬背，先记住。后面你就理解了。
					new 类名();
			类是模板，通过一个类，是可以创建N多个对象的。
			new是一个运算符。专门负责对象的创建。

			XueSheng s1 = new XueSheng();
			和
			int i = 100;
			解释一下：
				i是变量名
				int是变量的数据类型
				100是具体的数据。
				
				s1是变量名（s1不能叫做对象。s1只是一个变量名字。）
				XueSheng是变量s1的数据类型（引用数据类型）
				new XueSheng() 这是一个对象。（学生类创建出来的学生对象。）
			
			数据类型包括两种：
				基本数据类型：byte short int long float double boolean char
				引用数据类型：String、XueSheng.....

			java中所有的“类”都属于引用数据类型。

		*/
		XueSheng s1 = new XueSheng(); // 和 int i = 10;一个道理。

		// 再通过该类创建一个全新的对象
		XueSheng s2 = new XueSheng();

		// 再创建一个呢？
		XueSheng xsh = new XueSheng();

		// 以上的这个程序就相当于通过XueSheng类实例化了3个XueSheng对象。
		// 创建对象的个数没有限制，可以随意。只要有模板类就行。
		// 3个对象都属于学生类型。

	}
}
