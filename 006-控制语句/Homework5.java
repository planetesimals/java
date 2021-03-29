/*
从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行。

空格的规律：
	第1行4个空格(5-1)
	第2行3个空格(5-2)
	第3行2个空格(5-3)
	第4行1个空格(5-4)
	第5行0个空格(5-5)

星号的规律：
	第1行1个
	第2行3个
	第3行5个
	第4行7个
	.....

	行号 * 2 - 1
*/
public class Homework5{
	public static void main(String[] args){
		// 开发需要思路，实现这个功能需要一步一步来。
		// 这个步骤是什么？
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数作为行数：");
		int rows = s.nextInt();
		
		// 6行循环6次
		// n行循环n次
		for(int i = 1; i <= rows; i++){ // 外层循环控制的是总行数。
			
			// 我在这里需要将一行全部输出
			// 这里需要再使用循环，输出空格以及“*”
			// 输出空格的循环
			for(int j = 0; j < rows - i; j++){
				System.out.print(" ");
			}
			// 输出星号*的循环
			for(int k = 0; k < i * 2 - 1; k++){
				System.out.print("*");
			}

			// 以上两个for循环都结束之后，表示一行就结束了
			// 在这里换行
			System.out.println();
		}

	}
}