package com.situ.day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import org.junit.Test;


public class JdbcDemo {

	@Test
	public void loginStatement() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getConnection();
			String sql = "SELECT * FROM USER WHERE NAME='dfhddf' OR 1=1 -- ' AND PASSWORD='678678';";
			// 4、创建Statement
			statement = connection.createStatement();
			// 5、执行sql语句
			// 更新：delete/insert/update executeUpdate() 返回值int表示影响的行数
			// 查询：seleclt executeQuery() 返回结果集ResultSet
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				// String name = resultSet.getString(2);
				String name = resultSet.getString("name");
				String password = resultSet.getString("password");
				System.out.println("name:" + name + "\t" + "password:" + password + "\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement, resultSet);
		}
	}
	
	@Test
	public void loginPreparedStatement() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String name = "dfhddf' OR 1=1 -- ";
		String password = "678678";
		//String name = "zhangsan";
		//String password = "123";
		try {
			connection = JdbcUtil.getConnection();
			String sql = "SELECT * FROM USER WHERE NAME=? AND PASSWORD=?;";
			preparedStatement = connection.prepareStatement(sql);
			//设置参数的值                                    参数位置，参数值
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			/*while (resultSet.next()) {
				String userName = resultSet.getString("name");
				String userPassword = resultSet.getString("password");
				System.out.println("name:" + userName + ", password:" + userPassword);
			}*/
			if (resultSet.next()) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登陆失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void batchDemo() {
		long start = System.currentTimeMillis();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = JdbcUtil.getConnection();
			String sql = "INSERT INTO USER(NAME,PASSWORD) VALUES(?,?);";
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 1; i <= 1000; i++) {
				preparedStatement.setString(1, "zhangsan"+i);
				preparedStatement.setString(2, i + "");
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			preparedStatement.clearBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement);
		}
		
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println(delta);
	}
	
	@Test
public void transactionDemo() {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	String sql1 = "UPDATE account SET money=money-1000 WHERE NAME='zhangsan';";
	String sql2 = "UPDATE account SET money1=money+1000 WHERE NAME='lisi';";
	
	try {
		//手动开启事务，默认情况是自动开启了事务
		connection = JdbcUtil.getConnection();
		connection.setAutoCommit(false);
		//1、执行第一个sql语句
		preparedStatement = connection.prepareStatement(sql1);
		preparedStatement.executeUpdate();
		//2、执行第二个sql语句
		preparedStatement = connection.prepareStatement(sql2);
		preparedStatement.executeUpdate();
		
		// 提交事物
		connection.commit();
	} catch (SQLException e) {
		try {
			//出现异常回滚
			connection.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	} finally {
		JdbcUtil.close(connection, preparedStatement);
	}
}
	
	@Test
	public void transactionDemo1() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Savepoint savepoint = null;
		String sql1 = "UPDATE account SET money=money-1000 WHERE NAME='zhangsan';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='lisi';";
		
		String sql3 = "UPDATE account SET money=money-500 WHERE NAME='zhangsan';";
		String sql4 = "UPDATE account SET money1=money+500 WHERE NAME='lisi';";
		try {
			//手动开启事务，默认情况是自动开启了事务
			connection = JdbcUtil.getConnection();
			connection.setAutoCommit(false);
			//1、执行第一个sql语句
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			//2、执行第二个sql语句
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
			
			//设置保存点，回滚到这个位置
			savepoint = connection.setSavepoint();
			
			//3、执行第三个sql语句
			preparedStatement = connection.prepareStatement(sql3);
			preparedStatement.executeUpdate();
			//4、执行第四个sql语句
			preparedStatement = connection.prepareStatement(sql4);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			if (savepoint == null) {//第一次或者第二次转账有一次是失败
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} else {//第一次和第二次转账是成功的
				try {
					connection.rollback(savepoint);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		} finally {
			try {
				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JdbcUtil.close(connection, preparedStatement);
		}
	}
	
	
	
	
	
	
	
}
