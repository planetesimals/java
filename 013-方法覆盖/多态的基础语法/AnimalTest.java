public class AnimalTest{
	
	// test方法是程序员B负责编写。
	// 这个test()方法的参数是一个Animal
	public void test(Animal a){ // 实例方法
		// 你写的这个方法别人会去调用。
		// 别人调用的时候可能给你test()方法传过来一个Bird
		// 当然也可能传过来一个Cat
		// 对于我来说，我不知道你调用的时候给我传过来一个啥。
		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.catchMouse();
		}else if(a instanceof Bird){
			Bird b = (Bird)a;
			b.sing();
		}
	}

}