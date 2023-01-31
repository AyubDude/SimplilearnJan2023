package Mypackage;
import java.io.*;
public class FilereaderDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("file1.txt");
		int n;
		while((n = fr.read())!=1)
			System.out.println(char(n));
	}

}
