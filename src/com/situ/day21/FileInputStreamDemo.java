package com.situ.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class FileInputStreamDemo {
	/**
	 * 复制一个图片
	 */
	@Test
public void fileInputStreamCopy() {
	InputStream inputStream = null;
	OutputStream outputStream = null;
	
	try {
		inputStream = new FileInputStream("111.png");
		outputStream = new FileOutputStream("222.png");
		byte[] buffer = new byte[1024];
		int length = 0;
		while ((length = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, length);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (outputStream != null) {
			try {
				outputStream.close();
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
