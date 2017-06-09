package com.situ.day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import jdk.internal.jfr.events.FileWriteEvent;

import org.junit.Test;
import org.omg.PortableServer.POAPackage.WrongAdapter;

public class FileReaderDemo {
	
	@Test
	public void fileReader1() {
		try {
			FileReader fileReader = new FileReader("demo.txt");
			//读取单个字符,而且会自动往下移动，如果已到达流的末尾，则返回 -1
			int ch1 = fileReader.read();
			System.out.println(ch1);//97
			System.out.println((char)ch1);//a
			
			int ch2 = fileReader.read();
			System.out.println((char)ch2);//b
			
			int ch3 = fileReader.read();
			System.out.println((char)ch3);//c
			
			int ch4 = fileReader.read();
			System.out.println(ch4);//-1
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 复制一个文件
	 */
	@Test
	public void fileReader2() {
		Reader reader = null;
		Writer writer = null;
		try {
			char[] buffer = new char[1024];
			reader = new FileReader("demo.txt");
			writer = new FileWriter("demo_bak.txt");
			int length = 0;
			while ((length = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
