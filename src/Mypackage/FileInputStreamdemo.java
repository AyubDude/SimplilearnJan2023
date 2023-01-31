package Mypackage;

import java.io.*;

public class FileInputStreamdemo {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("file1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int size = bis.available();//returns the size of the file
		byte [] buffer = new byte[size];
		bis.read(buffer);
		String s= new String(buffer);//converts byte into string
		System.out.println(s);
		bis.close();
		fis.close();
	}
	

}
