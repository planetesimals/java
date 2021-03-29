public class MethodTest09{
	public static void main(String[] args){
		//调用sum方法
		int jieGuo = sum(10, 20);
		System.out.println(jieGuo); // 30

		// 上面两行代码能否合并为一行？
		// 可以
		System.out.println(sum(100, 200)); // 300

		System.out.println(m()); // true

		
		boolean flag = m();
		if(flag){
			System.out.println("真的。。。。。");
		}

		if(m()){
			System.out.println("真的。。。。。");
		}
	}

	public static boolean m(){
		return true;
	}


	// 求和的方法
	public static int sum(int a, int b){
		return a + b;
	}
}

