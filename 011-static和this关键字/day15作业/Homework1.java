/*
请通过代码封装，实现如下需求：
	编写一个类Book，代表教材:	
	1.具有属性：名称（title）、页数（pageNum）
	2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
	3.为各属性提供赋值和取值方法
	4.具有方法:detail，用来在控制台输出每本教材的名称和页数
	5.编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
*/
public class Homework1{
	public static void main(String[] args){
		// 创建Book对象
		Book b1 = new Book("高三数学人教版", 250);
		// 调用detail方法
		b1.detail();
		// 修改页数
		b1.setPageNum(100);
		b1.detail();

		Book b2 = new Book();
		b2.detail();
	}
}

class Book{
	// 名称
	private String title; //实例变量，引用. 的方式访问
	// 页数
	private int pageNum;

	// 构造方法，无参数
	public Book(){
		title = "未知";
		pageNum = 200;
	}

	// 有参数构造器
	public Book(String s, int i){
		title = s;
		if(i < 200){
			pageNum = 200;
			System.out.println("页数不能少于200，少于200时，页数默认为200页");
		}else{
			pageNum = i;
		}	
	}

	// setter and getter方法
	public void setTitle(String s){
		title = s;
	}
	public String getTitle(){
		return title;
	}
	public void setPageNum(int i){
		if(i < 200){
			System.out.println("本书页数不能少于200页，默认赋值200");
			// 默认赋值200
			pageNum = 200;
			return;
		}
		// 说明页数是大于等于200的。
		pageNum = i;
	}
	public int getPageNum(){
		return pageNum;
	}

	// 额外再提供一个detail方法
	public void detail(){
		//System.out.println("教材名称：" + this.title + "，总页数为" + this.pageNum);
		//this.是可以省略的
		System.out.println("教材名称：" + title + "，总页数为" + pageNum);

	}
}