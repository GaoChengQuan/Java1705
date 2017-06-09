package com.situ.day22.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBTest {
	public static void main(String[] args) throws Exception {
//		AbstractDB db = new MySql();
//		db.getConnection();
		
		InputStream inputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String className = properties.getProperty("className");
		System.out.println(className);
		//com.situ.day22.db.SqlServer
		Class clazz = Class.forName("com.situ.day22.db." + className);
		AbstractDB db = (AbstractDB) clazz.newInstance();
		db.getConnection();
	}
}
