/*
	测试多态在开发中的作用
*/
public class Test{
	public static void main(String[] args){
		// 创建主人对象
		Master zhangsan = new Master();
		// 创建宠物对象
		Dog zangAo = new Dog();
		// 主人喂
		zhangsan.feed(zangAo);
		// 创建宠物对象
		Cat xiaoHua = new Cat();
		// 主人喂
		zhangsan.feed(xiaoHua);
		// 创建宠物对象
		YingWu yingWu = new YingWu();
		// 主人喂
		zhangsan.feed(yingWu);
	}
}