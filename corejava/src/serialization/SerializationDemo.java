package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class demo implements Serializable{
	static transient int i = 10;
	final transient int j = 20;
}
public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		demo d1 = new demo();
		System.out.println("serialization started");
		FileOutputStream fos = new FileOutputStream("abcd.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("serialization ended");
		
		System.out.println("deserialization started");
		FileInputStream fis = new FileInputStream("abcd.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		demo d2 = (demo) ois.readObject();
		System.out.println("deserialization ended");
		System.out.println(d2.i+"......."+d2.j);
	}

}
