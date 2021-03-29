/*
	break;语句：
		1、break;语句比较特殊，特殊在：break语句是一个单词成为一个完整的java语句。
		另外：continue也是这样，他俩都是一个单词成为一条语句。

		2、break 翻译为折断、弄断。

		3、break;语句可以用在哪里呢？
			用在两个地方，其它位置不行
			第一个位置：switch语句当中，用来终止switch语句的执行。
				用在switch语句当中，防止case穿透现象，用来终止switch。

			第二个位置：break;语句用在循环语句当中，用来终止循环的执行。
				用在for当中
				用在while当中
				用在do....while..当中。
		
		4、以下程序主要是以for循环为例学习break转向语句。

		5、break;语句的执行并不会让整个方法结束，break;语句主要是用来终止离它最近
		的那个循环语句。

		6、怎么用break;语句终止指定的循环呢？
			第一步：你需要给循环起一个名字，例如：
				a: for(){
					b:for(){
					
					}
				}
			第二步：终止：break a;
*/
public class BreakTest01{

	public static void main(String[] args){

		// 输出0-9
		/*
		for(int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}
		*/

		for(int i = 0; i < 10; i++){
			if(i == 5){
				// break;语句会让离它最近的循环终止结束掉。
				break; // break;终止的不是if，不是针对if的，而是针对离它最近的循环。
			}
			System.out.println("i = " + i); // 0 1 2 3 4
		}

		// 这里的代码照常执行。break;的执行并不会影响这里。
		System.out.println("Hello World!");

		// 这个for循环两次
		for(int k = 0; k < 2; k++){ // 外层for
			for(int i = 0; i < 10; i++){ // 内层for
				if(i == 5){
					break; // 这个break;语句只能终止离它最近的for
				}
				System.out.println("i ===> " + i); 
			}
		}

		System.out.println("------------------------------------------");

		// 以下讲解的内容，以后开发很少用。不要紧张。
		// 这种语法很少用，了解一下即可。
		a:for(int k = 0; k < 2; k++){ 
			b:for(int i = 0; i < 10; i++){
				if(i == 5){
					break a; // 终止指定的循环。
				}
				System.out.println("i ===> " + i); 
			}
		}

		System.out.println("呵呵");

	}
}

