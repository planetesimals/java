
// 使用继承机制来解决代码复用问题。
// 继承也是存在缺点的：耦合度高，父类修改，子类受牵连。
public class ExtendsTest02{
	public static void main(String[] args){
		// 创建普通账户
		Account act = new Account();
		act.setActno("1111111");
		act.setBalance(10000);
		System.out.println(act.getActno() + ",余额" + act.getBalance());

		// 创建信用账户
		CreditAccount ca = new CreditAccount();
		ca.setActno("2222222");
		ca.setBalance(-10000);
		ca.setCredit(0.99);
		System.out.println(ca.getActno() + ",余额" + ca.getBalance() + ",信誉度" + ca.getCredit());
	}
}

// 银行账户类
// 账户的属性：账号、余额
class Account{ // 父类
	// 属性
	private String actno;
	private double balance;

	// 构造方法
	public Account(){
	
	}
	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
	}

	// setter and getter
	public void setActno(String actno){
		this.actno = actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
}

// 其它类型的账户：信用卡账户
// 账号、余额、信誉度
class CreditAccount extends Account{ //子类

	// 属性
	private double credit;

	// 构造方法
	public CreditAccount(){
	
	}

	public void doSome(){
		//错误: actno 在 Account 中是 private 访问控制
		//System.out.println(actno);
		// 间接访问
		//System.out.println(this.getActno());
		System.out.println(getActno());
	}

	// setter and getter方法
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
	
}