/*
1、所有合法的“控制语句”都可以嵌套使用。
2、for循环嵌套一个for循环执行原理是什么？
	提示一下：大家不要因为for循环中嵌套了一个for循环，就感觉
	这个程序比较特殊，实际上大家可以这样看待：
		for(){
			//在分析外层for循环的时候，把里面的for就当做一段普通的java语句/代码.
			for(){}
		}
*/
public class ForTest05{
	public static void main(String[] args){

		// 单层for循环
		for(int i = 0; i < 10; i++){ 
			System.out.println("i = " + i);
		}

		for(int k = 0; k < 2; k++){ // 循环2次
			System.out.println("k = " + k);
		}

		for(int k = 0; k < 2; k++){ // 循环2次
			//System.out.println("k ==> " + k);
			for(int i = 0; i < 10; i++){ 
				System.out.println("i ---> " + i);
			}
		}
		
		/*
		int i = 0;
		for(int k = 0; k < 2; k++){
			//System.out.println("k's value = " + k);
			for(; i < 10; i++){ 
				System.out.println("k's value = " + k);
				System.out.println("value ---> " + i);
			}
		}
		*/
		
		
		for(int k = 0; k < 2; k++){
			for(int i = 0; i < 10; i++){ 
				System.out.println("k's value = " + k); 
				System.out.println("value ---> " + i); 
			}
		}

		/*
		// 第一遍
		for(int i = 0; i < 10; i++){ 
			System.out.println("i ==> " + i);
		}

		// 第二遍
		for(int i = 0; i < 10; i++){ 
			System.out.println("i ==> " + i);
		}
		*/

	}
}