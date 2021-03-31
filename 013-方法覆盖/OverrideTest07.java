
public class OverrideTest07{
	public static void main(String[] args){
		// 一般重写的时候都是复制粘贴。不要动。不要改。	
	}
}

class Animal{
	/*
	public double sum(int a, int b){
		return a + b;
	}
	*/
	
	/*
	public long sum(int a, int b){
		return a + b;
	}
	*/

	/*
	public int sum(int a, int b){
		return a + b;
	}
	*/
}

class Cat extends Animal{
	// 重写
	// 错误: Cat中的sum(int,int)无法覆盖Animal中的sum(int,int)
	/*
	public int sum(int a, int b){
		return a + b;
	}
	*/
	
	/*
	public double sum(int a, int b){
		return a + b;
	}
	*/

	//错误: Cat中的sum(int,int)无法覆盖Animal中的sum(int,int)
	/*
	public long sum(int a, int b){
		return a + b;
	}
	*/
}

// 父类
class MyClass1{
	
	public Animal getAnimal(){
		return null;
	}
}

// 子类
class MyClass2 extends MyClass1{

	// 重写父类的方法
	/*
	public Animal getAnimal(){
		return null;
	}
	*/

	// 重写的时候返回值类型由Animal变成了Cat，变小了。（可以，java中允许）
	/*
	public Cat getAnimal(){
		return null;
	}
	*/

	// 重写的时候返回值类型由Animal变成了Object。变大了。（不行，java中不允许）
	/*
	public Object getAnimal(){
		return null;
	}
	*/
}