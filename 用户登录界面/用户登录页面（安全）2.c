package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
实现功能：
    1、需求：
        模拟用户登录功能的实现。
    2、业务描述：
        程序运行的时候，提供一个输入的入口，可以让用户输入用户名和密码
        用户输入用户名和密码，提交信息，java程序收集到用户信息
        java程序连接数据库验证用户名和密码是否合法
        合法：显示登录成功
        不合法：显示登录失败
    3、数据的准备：
        在实际开发中，表的设计会使用专业的建模工具，我们这里安装了一个建模工具：PowerDesigner
        使用PD工具来进行数据库表的设计。（参见user-login.sql脚本）
    4、当前程序存在的问题：
        用户名：fdsa
        密码：fdsa' or '1'='1
        登录成功！
        这种现象被称为SQL注入。（黑客经常使用）
     5、导致SQL注入的根本原因是什么？
        用户输入的信息中含有sql语句的关键字，并且这些关键字参与sql语句的编译过程，
        导致sql语句的原意被扭曲，进而达到sql注入。
 */
/*
    1、解决SQL注入问题。
        只要用户提供的信息不参与SQL语句的编译过程，问题就解决了。
        即使用户提供的信息中含有SQL语句的关键字，但是没有参与编译，不起作用。
        要想用户信息不参与SQL语句的编译，那么必须使用java.sql.PreparedStatement
        PreparedStatement继承了java.sql.Statement
        PreparedStatement是属于预编译的数据库操作对象
        PreparedStatement的原理：预先对SQL语句的框架进行编译，然后再给SQL语句进行传“值”。
    2、测试结果：
        用户名：fdsa
        密码：fdsa' or '1'='1
        登录失败！
    3、解决SQL注入的关键是什么？
        用户提供的信息中即使含有sql语句的关键字，但是这些关键字都并没有参与编译。不起作用。
    4、对比一下Statement和PreparedStatement?
        -Statement存在sql注入问题，PreparedStatement解决了SQL注入问题。
        -Statement是编译一次执行一次，PreparedStatement是编译一次，可执行N次（只要不改变原句，就不需要重新编译。）PreparedStatement效率较高一些。
        -PreparedStatement会在编译阶段做类型的安全检查。

        综上所述，PreparedStatement使用较多。只有极少数的情况下需要使用Statement。
     5、什么情况下必须使用Statement呢？
        业务方面要求必须支持SQL注入的时候



public class LoginTest {
    public static void main(String[] args) {
        //初始化一个界面
        Map<String,String> userLoginInfo = initUI();
        //验证用户名和密码
        boolean loginSuccess =login(userLoginInfo);
        //最后输出结果
        System.out.println(loginSuccess ? "登录成功！":"登录失败！");
    }

    /**
     * 用户登录
     * @param userLoginInfo 用户登录信息
     * @return false表示失败，true表示成功
     */
private static boolean login(Map<String, String> userLoginInfo){
        //打标记的意识
        boolean loginSuccess=false;
        //单独定义变量
        String loginName=userLoginInfo.get("loginName");
        String loginPwd=userLoginInfo.get("loginPwd");
        //JDBC代码
        Connection conn=null;
        PreparedStatement ps=null;  //这里使用PreparedStatement（预编译的数据库操作对象）
        ResultSet rs=null;
        //1、注册驱动
        try{
        //1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获取连接
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8","root","981124");
        //3、获取预编译的数据库操作对象
        //SQL语句的框子。其中一个？，表示一个占位符，一个？将来接收一个“值”，注意：占位符不能使用单引号括起来。
        String sql="select * from t_user where loginName =? and loginPwd = ?";  //?是占位符
        //程序执行到此处，会发送sql语句框子给DBMS，然后DBMS进行sql语句的预先编译。
        ps=conn.prepareStatement(sql);   //方法是动词
        //给占位符？传值（第一个问号下标是1，第二个问号下标是2，JDBC中所有下标从1开始。）
        ps.setString(1,loginName);//1是下标
        ps.setString(2,loginPwd);
        //4、执行sql
        rs=ps.executeQuery();
        //5、处理查询结果集
        if(rs.next()){
        //登录成功
        loginSuccess=true;
        }
        }catch(Exception e){
        e.printStackTrace();
        }finally{
        //6、释放资源
        if(rs!=null){
        try{
        rs.close();
        }catch(SQLException e){
        e.printStackTrace();
        }
        }
        if(ps!=null){
        try{
        ps.close();
        }catch(SQLException e){
        e.printStackTrace();
        }
        }
        if(conn!=null){
        try{
        conn.close();
        }catch(SQLException e){
        e.printStackTrace();
        }
        }
        }
        return loginSuccess;
        }

/**
 * 初始化用户界面
 *
 * @return用户输入的用户名和密码等登录信息
 */
private static Map<String, String> initUI(){
        Scanner s=new Scanner(System.in);

        System.out.print("用户名：");
        String loginName=s.nextLine();

        System.out.print("密码：");
        String loginPwd=s.nextLine();

        Map<String, String> userLoginInfo=new HashMap<>();
        userLoginInfo.put("loginName",loginName);
        userLoginInfo.put("loginPwd",loginPwd);

        return userLoginInfo;
        }
        }
