package com.situ.day27;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.situ.day26.JdbcUtil;

public class CallableStatementDemo {
public static void main(String[] args) {
	Connection connection = null;
	CallableStatement callableStatement = null;
	ResultSet resultSet = null;
	
	try {
		connection = JdbcUtil.getConnection();
		callableStatement = connection.prepareCall("CALL show_student");
		resultSet = callableStatement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String address = resultSet.getString("address");
			System.out.println("id:" + id + "\t name:" + name + "\t address:" + address);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
