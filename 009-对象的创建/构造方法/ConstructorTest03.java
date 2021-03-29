public class ConstructorTest03{
	public static void main(String[] args){
		//调用不同的构造方法创建对象
		Vip v1 = new Vip();
		System.out.println(v1.no); //0
		System.out.println(v1.name); // null
		System.out.println(v1.birth); // null
		System.out.println(v1.sex); // false

		Vip v2 = new Vip(11111L, "大灰狼");
		System.out.println(v2.no); // 11111L
		System.out.println(v2.name); // "大灰狼"
		System.out.println(v2.birth); // null
		System.out.println(v2.sex); // false

		Vip v3 = new Vip(22222L, "小绵羊", "2000-10-10");
		System.out.println(v3.no); // 22222L
		System.out.println(v3.name); //"小绵羊"
		System.out.println(v3.birth); // "2000-10-10"
		System.out.println(v3.sex); // false

		Vip v4 = new Vip(33333L, "钢铁侠", "1980-10-11", true);
		System.out.println(v4.no); // 33333L
		System.out.println(v4.name); //"钢铁侠"
		System.out.println(v4.birth); //"1980-10-11"
		System.out.println(v4.sex); //true
	}

}