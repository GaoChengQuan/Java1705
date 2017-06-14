package com.situ.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo {
	// 开发步骤：
	// 1、加载驱动 Class.forName("");
	// 2、获取连接对象Connection
	// 3、写sql语句
	// 4、创建Statement
	// 5、执行sql语句
	// 更新：delete/insert/update executeUpdate() 返回值int表示影响的行数
	// 查询：seleclt executeQuery() 返回结果集ResultSet
	// 6、关闭

	@Test
	public void createTable() {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DBUtil.getConnection();
			// 3、写sql语句
			String sql = "CREATE TABLE teacher(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(10));";
			// 4、创建Statement
			statement = connection.createStatement();
			// 5、执行sql语句
			// 更新：delete/insert/update executeUpdate() 返回值int表示影响的行数
			// 查询：seleclt executeQuery() 返回结果集ResultSet
			int result = statement.executeUpdate(sql);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(connection, statement);
		}
	}


	@Test
	public void selectDemo() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			// 3、写sql语句
			String stuName = "张三";
			//String sql = "SELECT * FROM student WHERE NAME='" + stuName + "';";
			String sql = "SELECT * FROM student";
			// 4、创建Statement
			statement = connection.createStatement();
			// 5、执行sql语句
			// 更新：delete/insert/update executeUpdate() 返回值int表示影响的行数
			// 查询：seleclt executeQuery() 返回结果集ResultSet
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				//String name = resultSet.getString(2);
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				System.out.println("name:" + name + "\t" + "age:" + age + "\t" + "address:" + address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(connection, statement, resultSet);
		}
	}
}
