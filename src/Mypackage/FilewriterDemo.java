package Mypackage;

import java.io.*;


public class FilewriterDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("file3.txt");
		BufferedWriter bw =  new BufferedWriter(fw);
		String s = "Hibernate is ORM framework";
		bw.write(s);
		System.out.println("File created");
		bw.close();
		fw.close();

	}

}
