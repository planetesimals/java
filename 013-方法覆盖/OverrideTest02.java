/*
	回顾一下方法重载！！！！
		什么时候考虑使用方法重载overload？
			当在一个类当中，如果功能相似的话，建议将名字定义的一样，这样
			代码美观，并且方便编程。
		
		什么条件满足之后能够构成方法重载overload？
			条件一：在同一个类当中
			条件二：方法名相同
			条件三：参数列表不同（个数、顺序、类型）

	--------------------------------------------------------------------------------

	什么时候我们会考虑使用“方法覆盖”呢？
		子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求时，
		子类有权利对这个方法进行重新编写，有必要进行“方法的覆盖”。
	
	方法覆盖又叫做：方法重写（重新编写），英语单词叫做：Override、Overwrite，都可以。
	比较常见的：方法覆盖、方法重写、override

	重要结论：
		当子类对父类继承过来的方法进行“方法覆盖”之后，
		子类对象调用该方法的时候，一定执行覆盖之后的方法。

	当我们代码怎么编写的时候，在代码级别上构成了方法覆盖呢？
		条件一：两个类必须要有继承关系。
		条件二：重写之后的方法和之前的方法具有：
					相同的返回值类型、
					相同的方法名、
					相同的形式参数列表。
		条件三：访问权限不能更低，可以更高。（这个先记住。）
		条件四：重写之后的方法不能比之前的方法抛出更多的异常，可以更少。（这个先记住）
	
	这里还有几个注意事项：（这几个注意事项，当学习了多态语法之后自然就明白了！）
		注意1：方法覆盖只是针对于方法，和属性无关。
		注意2：私有方法无法覆盖。
		注意3：构造方法不能被继承，所以构造方法也不能被覆盖。
		注意4：方法覆盖只是针对于“实例方法”，“静态方法覆盖”没有意义。

*/
public class OverrideTest02{
	public static void main(String[] args){
		Bird b = new Bird();
		b.move();
		b.sing(1000); //Animal sing....

		Cat c = new Cat();
		c.move();
	}
}

class Animal{
	public void move(){
		System.out.println("动物在移动！");
	}

	public void sing(int i){
		System.out.println("Animal sing....");
	}
}

class Bird extends Animal{

	// 对move方法进行方法覆盖，方法重写，override
	// 最好将父类中的方法原封不动的复制过来。（不建议手动编写）
	// 方法覆盖，就是将继承过来的那个方法给覆盖掉了。继承过来的方法没了。
	public void move(){
		System.out.println("鸟儿在飞翔！！！");
	}

	//protected表示受保护的。没有public开放。
	// 错误：正在尝试分配更低的访问权限; 以前为public
	/*
	protected void move(){
		System.out.println("鸟儿在飞翔！！！");
	}
	*/

	//错误：被覆盖的方法未抛出Exception
	/*
	public void move() throws Exception{
		System.out.println("鸟儿在飞翔！！！");
	}
	*/

	// 分析：这个sing()和父类中的sing(int i)有没有构成方法覆盖呢？
	// 没有，原因是，这两个方法根本就是两个完全不同的方法。
	// 可以说这两个方法构成了方法重载吗？可以。
	public void sing(){
		System.out.println("Bird sing.....");
	}
}

class Cat extends Animal{

	// 方法重写
	public void move(){
		System.out.println("猫在走猫步！！！");
	}
}