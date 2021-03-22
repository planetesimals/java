package com.bjpowernode.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest {
    public static void main(String[] args) {
        /*
        //用户在控制台输入desc就是降序，输入asc就是升序
        Scanner s = new Scanner(System.in);
        System.out.println("请输入desc或asc，desc表示降序，asc表示升序");
        System.out.print("请输入：");
        String keyWords = s.nextLine();
        //执行sql
        Connection conn = null;
        PreparedStatement ps = null;  //这里使用PreparedStatement（预编译的数据库操作对象）
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8","root","981124");
            //获取预编译的数据库操作对象
            String sql = "select ename from emp order by ename ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,keyWords);
            //执行SQL
            ps.executeQuery();
            //遍历查询结果集
            while(rs.next()){
                System.out.println(rs.getString("ename"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        */


        //用户在控制台输入desc就是降序，输入asc就是升序
        Scanner s = new Scanner(System.in);
        System.out.println("请输入desc或asc，desc表示降序，asc表示升序");
        System.out.print("请输入：");
        String keyWords = s.nextLine();
        //执行sql
        Connection conn = null;
        Statement stmt = null;  //这里使用PreparedStatement（预编译的数据库操作对象）
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8","root","981124");
            //获取数据库操作对象
           stmt = conn.createStatement();
            //执行SQL


            String sql = "select ename from emp order by ename "+ keyWords;//ename后面要有空格，不然会报错

            rs = stmt.executeQuery(sql);
            //遍历查询结果集
            while(rs.next()){
                System.out.println(rs.getString("ename"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
