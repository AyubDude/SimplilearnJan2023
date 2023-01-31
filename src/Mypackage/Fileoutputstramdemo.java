package Mypackage;
import java.io.*;

public class Fileoutputstramdemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Java is OO programming language";
		bos.write(s.getBytes());//converts string into byte[]
		System.out.println("File created");
		bos.close();
		fos.close();

	}

}
