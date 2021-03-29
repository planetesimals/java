public class 学生{
	int 学号;
	String 姓名;

	// 入口
	public static void main(String[] args){
		学生 张三 = new 学生();
		System.out.println(张三.学号); // 0
		System.out.println(张三.姓名); // null

		张三.学号 = 1111;
		张三.姓名 = "张三";
		System.out.println(张三.学号);
		System.out.println(张三.姓名);
	}
}