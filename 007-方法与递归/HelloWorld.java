public class HelloWorld{
	public static void main(String[] args){
		//System.out.println("hello world!");
		//错误: 找不到符号
		//p("Hello World!");
		S.p("Hello World!");
		S.p(100);
		S.p('a');
		S.p(true);
		S.p(100 + 200);
		S.p(10 / 3);

		// 调用hehe
		HelloWorld.hehe();
		hehe();
	}

	public static void hehe(){
		System.out.println("呵呵");
	}
}
