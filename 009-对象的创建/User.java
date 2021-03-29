/*
	User类：用户类
*/
public class User{
	// 用户id
	// 访问id不能这样：User.id （这是错误的，实例变量不能用类名访问。）
	// id的访问必须先造对象，然后对象有了，才能访问对象的id
	int id; //成员变量，实例变量（对象变量，一个对象一份。）
	// 用户名
	String username; // 成员变量可以不手动赋值，系统赋默认值。
	// 密码
	String password;
}

/*
class 人类{
	// 成员变量，实例变量，对象级别变量，先造对象才能访问。
	double 身高;
}
*/

// byte short int long float double boolean char :这些默认值偏向0，false也是0
// 引用类型：null