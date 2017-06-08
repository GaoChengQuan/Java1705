package com.situ.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Test;


public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void objectOutputStreamDemo() {
		Person person = new Person("zhangsan", 20);
		OutputStream outputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			outputStream = new FileOutputStream("person");
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void objectInputStreamDemo() {
		InputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			inputStream = new FileInputStream("person");
			objectInputStream = new ObjectInputStream(inputStream);
			Object object = objectInputStream.readObject();
			Person person = (Person) object;
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objectInputStream != null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
