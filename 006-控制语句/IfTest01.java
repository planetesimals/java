/*
	if语句的语法结构以及运行原理？
		if语句是分支语句，也可以叫做条件语句。
		if语句的语法格式：
			第一种写法：
				int a = 100;
				int b = 200;
				if(布尔表达式){
					java语句;
					java语句;
				}
				这里的一个大括号{} 叫做一个分支。
				if 这个单词翻译为如果，所以又叫做条件语句。
				该语法的执行原理是：
					如果布尔表达式的结果是true，则执行大括
					号中的程序，否则大括号中代码不执行。

			第二种写法：
				if(布尔表达式){  // 分支1
					java语句;     
				}else{            // 分支2
					java语句;
				}
				执行原理：如果布尔表达式的结果是true，则执行
				分支1，分支2不执行。如果布尔表达式的结果是false，
				分支1不执行，执行分支2.
				以上的这个语句可以保证一定会有一个分支执行。
				else表示其它。
			
			第三种写法：
				if(布尔表达式1){ // 分支1
					java语句;
				}else if(布尔表达式2){ // 分支2
					java语句;
				}else if(布尔表达式3){
					java语句;
				}else if(布尔表达式4){
					java语句;
				}....
				以上if语句的执行原理？
					先判断“布尔表达式1”，如果“布尔表达式1”为true，则执行分支1，
					然后if语句结束了。
					当“布尔表达式1”结果是false，那么会继续判断布尔表达式2的结果，
					如果布尔表达式2的结果是true，则执行分支2，然后整个if就结束了。

					从上往下依次判断，主要看第一个true发生在哪个分支上。
					第一个true对应的分支执行，只要一个分支执行，整个if结束。
			
			第四种写法：
				if(布尔表达式1){ // 分支1
					java语句;
				}else if(布尔表达式2){ // 分支2
					java语句;
				}else if(布尔表达式3){
					java语句;
				}else if(布尔表达式4){
					java语句;
				}else{
					java语句; // 以上条件没有一个成立的。这个else就执行了。
				}

		
		注意：
			1、对于if语句来说，在任何情况下只能有1个分支执行，不可能
				存在2个或者更多个分支执行。if语句中只要有1个分支执行了，
				整个if语句就结束了。（对于1个完整的if语句来说的。）
			
			2、以上4种语法机制中，凡是带有else分支的，一定可以保证会有
			一个分支执行。以上4种当中，第一种和第三种没有else分支，这样
			的语句可能会导致最后一个分支都不执行。第二种和第四种肯定会有
			1个分支执行。

			3、当分支当中“java语句;”只有1条，那么大括号{}可以省略，但为了
			可读性，最好不要省略。（有的程序员在编写代码的时候，可能会故意
			将大括号{}省略，你能看懂就行。）

			4、控制语句和控制语句之间是可以嵌套的，但是嵌套的时候大家最好
			一个语句一个语句进行分析，不要冗杂在一起分析。
				if(true){
					//窍门：分析外面if语句的时候，里面的这个if语句可以看做是普通的一堆java代码。
					if(true){
						if(false){
						
						}else{
							....最终走这里了。
						}
					}else{
					
					}
				}else{
				
				}

				if(){
					// 窍门：分析外面if时，里面的for循环当做普通java代码来看。
					for(){
						if(){
							for(){
							
							}
						}
					}
				}else{
					while(){
						if(){
							for(){
							
							}
						}
					}
				}

*/
public class IfTest01{
	public static void main(String[] args){

		// 定义一个布尔类型的变量，表示性别。
		//boolean sex = true;
		boolean sex = false;

		//业务：当sex为true时表示男，为false时表示女。
		/*
		if(sex == true){ // == 是关系运算符，不是赋值运算符，== 双等号是用来判断是否相等的。
			System.out.println("男");
		}else{
			System.out.println("女");
		}
		*/

		// 改良。
		sex = true;
		if(sex){
			System.out.println("男");
		}else{
			System.out.println("女");
		}

		// 可以再进一步改良
		// 可以使用三目运算符
		sex = false;
		System.out.println(sex ? "男" : "女");

		// 代码可以这样写吗？
		// ()小括号当中最终取的值是sex变量的值。
		// 而sex是布尔类型，所以这个可以通过。
		sex = false;
		if(sex = true){ // 以前sex不管是true还是false，走到这一行sex一定是true。
			System.out.println("男"); // 输出"男"
		}else{
			// 虽然这种语法可以，但是会导致else分支永远不能执行。
			System.out.println("女");
		}

		int i = 100;
		if(i == 100){
			System.out.println("i是100");
		}

		/*
		//错误: 不兼容的类型: int无法转换为boolean
		if(i = 100){ // (i = 100)整体执行完之后是一个int类型，不是布尔类型。
			System.out.println("i是100");
		}
		*/

		// 当分支中只有一条java语句的话，大括号可以省略。
		if(sex) 
			System.out.println("男"); 
		else 
			System.out.println("女");
		
		
		// 判断以下程序会出现问题吗？会出什么问题？第几行代码报错？？？？
		if(sex)
			System.out.println("男");
			System.out.println("HelloWorld!"); // 以上的这3行代码没有问题，合乎语法。
		/*
		else // 这一行编译报错，因为else缺少if
			System.out.println("女");
		*/
		

	}
}