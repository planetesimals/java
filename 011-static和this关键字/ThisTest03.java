/*
1、this可以使用在实例方法中，不能使用在静态方法中。
2、this关键字大部分情况下可以省略，什么时候不能省略呢？
	在实例方法中，或者构造方法中，为了区分局部变量和实例变量，
	这种情况下：this. 是不能省略的。
*/
public class ThisTest03{
	public static void main(String[] args){

		Student s = new Student();
		s.setNo(111);
		s.setName("张三");
		System.out.println("学号：" + s.getNo());
		System.out.println("姓名：" + s.getName());

		Student s2 = new Student(2222, "李四");
		System.out.println("学号：" + s2.getNo());
		System.out.println("姓名：" + s2.getName());

	}
}

// 分析一下：以下代码哪里写的不好。
// 学生类
class Student{
	//学号
	private int no;

	//姓名
	private String name;

	//构造方法无参
	public Student(){
	
	}

	//构造方法有参
	/*
	public Student(int i, String s){
		no = i;
		name = s;
	}
	*/

	// 上面的构造方法也增强以下可读性
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

	// setter and getter方法
	/*
	public void setNo(int i){
		no = i;
	}
	*/
	/*
	public void setNo(int no){ // 就近原则。
		no = no; //这两个no都是局部变量no，和实例变量no没关系。
	}
	*/
	public void setNo(int no){ 
		//no是局部变量
		//this.no 是指的实例变量。
		this.no = no; // this. 的作用是：区分局部变量和实例变量。
	}
	public int getNo(){
		return no;
		//return this.no;
	}
	/*
	public void setName(String s){
		name = s;
	}
	*/
	/*
	public void setName(String name){ // 就近原则
		name = name; //这两个name都是局部变量name，和实例变量name没关系。
	}
	*/
	public void setName(String name){
		this.name = name;
	}

	/*
	public String getName(){
		return name;
	}
	*/

	public String getName(){ // getName实际上获取的是“当前对象”的名字。
		//return this.name; // 严格来说，这里是有一个 this. 的。只不过这个 this. 是可以省略的。
		return name;
	}
}