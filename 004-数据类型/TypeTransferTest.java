public class TypeTransferTest{
	public static void main(String[] args){
		// 编译报错，因为1000已经超出范围了。
		//byte b1 = 1000;
		// 可以
		byte b2 = 20;
		// 可以
		short s = 1000;
		// 可以
		int c = 1000;
		// 可以
		long d = c;
		// 编译报错
		//int e = d;
		// 可以
		int f = 10 / 3;
		// 可以
		long g = 10;
		// 编译报错
		//int h = g / 3;
		// 可以
		long m = g / 3;
		// 编译报错
		//byte x = (byte)g / 3;
		// 可以
		short y = (short)(g / 3);
		// 可以
		short i = 10;
		// 可以
		byte j = 5;
		// 编译报错
		//short k = i + j;
		// 可以
		int n = i + j;
		// 可以
		char cc = 'a';
		System.out.println(cc); // a
		System.out.println((byte)cc); // 97
		// cc 会先自动转换成int类型，再做运算
		int o = cc + 100;
		System.out.println(o); // 197
	}
}