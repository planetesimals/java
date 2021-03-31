/*
编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
可以弹奏的乐器包括二胡、钢琴和琵琶。
	实现思路及关键代码：
		1)定义乐器类Instrument，包括方法makeSound()
		2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
		3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
		4)定义测试类，给乐手不同的乐器让他弹奏
*/
public class Homework{
	public static void main(String[] args){
		/*
		// 创建各种乐器对象
		Erhu erhu = new Erhu();
		Piano piano = new Piano();
		Violin violin = new Violin();
		// 创建乐手对象
		Musician musician = new Musician();
		// play
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
		*/

		/*
		// 创建各种乐器对象
		Instrument erhu = new Erhu();
		Instrument piano = new Piano();
		Instrument violin = new Violin();
		// 创建乐手对象
		Musician musician = new Musician();
		// play
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
		*/

		// 创建乐手对象
		Musician musician = new Musician();
		// play
		musician.play(new Erhu());
		musician.play(new Piano());
		musician.play(new Violin());
	}
}

// 第一种写法
/*
// 乐手
class Musician{
	// 实例变量
	Instrument i;
	// 构造方法
	public Musician(){
	}
	public Musician(Instrument i){
		this.i = i;
	}
	// play()方法
	public void play(){
		i.makeSound();
	}
}
*/

// 第二种写法（更符合题意）
// 乐手
class Musician{

	// 乐手的名字
	//private String name;

	public void play(Instrument i){
		// 编译阶段makeSound()方法是Instrument的。
		// 运行阶段这个makeSound()方法就不一定是谁的了。
		i.makeSound();
	}
}

// 乐器父类
class Instrument{
	// 乐器发声
	public void makeSound(){
	
	}
}

// 子类
class Erhu extends Instrument{
	public void makeSound(){
		System.out.println("二胡的声音！！！");
	}
}
// 子类
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("钢琴的声音！！！");
	}
}
// 子类
class Violin extends Instrument{
	public void makeSound(){
		System.out.println("小提琴的声音！！！");
	}
}

