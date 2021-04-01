//中餐厨师
// 实现菜单上的菜
// 厨师是接口的实现者。
public class ChinaCooker implements FoodMenu{

	// 西红柿炒蛋
	public void shiZiChaoJiDan(){
		System.out.println("中餐师傅做的西红柿炒鸡蛋，东北口味！");
	}

	// 鱼香肉丝
	public void yuXiangRouSi(){
		System.out.println("中餐师傅做的鱼香肉丝，东北口味！");
	}
}