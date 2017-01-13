package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName="Bhaskar";
	transient String pwd="kajal";
	
	private void writeObject(ObjectOutputStream os)throws Exception {
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is)throws Exception {
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd;
	}
}


public class CustomSerializeDemo {

	public static void main(String[] args)throws Exception{
		Account a1=new Account();
		System.out.println(a1.userName+"........."+a1.pwd);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account)ois.readObject();
		System.out.println(a2.userName+"........."+a2.pwd);
		}

}
