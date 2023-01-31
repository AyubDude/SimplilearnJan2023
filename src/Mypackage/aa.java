package Mypackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class aa {

	public static void main(String[] args) {
		try {
            File file = new File("file1.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

	}

}
