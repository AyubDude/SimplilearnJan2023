package Mypackage;
import java.io.*;
class Book implements Serializable
{
	int bno;
	String bname;
	transient double price;//not included during serialization
	public Book(int bno,String bname,double price) {
		this.bname = bname;
		this.bno = bno;
		this.price = price;
	}
	public Book() {}
	public String tostring() {
		return bno+" "+bname+" "+price;
	}
	
}

public class SerDemo {
	public static void main(String[] args)throws IOException {
		
		FileOutputStream fos = new FileOutputStream("book.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Book b = new Book(11,"Java",2500);
		oos.writeObject(b);
		oos.close();
		fos.close();
		//Deserialization
		FileInputStream fis = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Book b1 =(Book)
	}

}
