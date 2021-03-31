
// 鸟儿类，子类
public class Bird extends Animal{

	// 重写父类的move方法
	public void move(){
		System.out.println("鸟儿在飞翔！！！");
	}

	// 也有自己特有的方法
	public void sing(){
		System.out.println("鸟儿在歌唱！！！");
	}

}