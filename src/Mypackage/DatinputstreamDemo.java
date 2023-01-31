package Mypackage;
import java.io.*;

public class DatinputstreamDemo  {

	public static void main(String[] args) throws IOException{
		File file = new File("file2.txt");
		if (!file.exists()) {
		    System.out.println("The file does not exist.");
		} else if (!file.canRead()) {
		    System.out.println("You do not have permission to read the file.");
		} else {
		    try {
		        FileInputStream fis = new FileInputStream("file2.txt");
		        DataInputStream dis = new DataInputStream(fis);
		        byte[] buffer = new byte[(int) file.length()];
		        dis.readFully(buffer);
		        System.out.println("Contents of the file: " + new String(buffer));
		        fis.getChannel().position(0); // Reset the position of the stream to the beginning
		        int n = dis.readInt();
		        System.out.println(n);
		        String s = dis.readUTF();
		        System.out.println(s);
		        double d = dis.readDouble();
		        System.out.println(d);
		        dis.close();
		        fis.close();
		    } catch (IOException e) {
		        System.out.println("An error occurred while reading the file: " + e.getMessage());
		    }
		}

	}
}




