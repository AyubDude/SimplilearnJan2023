package Mypackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileAppendemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = "Hey we are going";
		Files.write(Paths.get("C://javaPrograms2023//Demo.txt"), data.getBytes());

	}

}
