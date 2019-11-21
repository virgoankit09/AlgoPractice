package queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialTestMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		/*B s = new B();
		
		ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("datafile"));
		save.writeObject(s);
		
		save.flush();
		
		ObjectInputStream restore = new ObjectInputStream(new FileInputStream("datafile"));
		
		B s2 = (B) restore.readObject();*/
		
		
		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean(false);
		Boolean bool3 = new Boolean("false");
		Boolean bool4 = new Boolean(bool1);
		Boolean bool5 = new Boolean(true);
		
		//System.out.println(bool2.equals(bool3));
		//System.out.println(bool1 == bool4);
		byte b1 = 10;
		Byte b = new Byte(b1);
		method(10);
		method("ankit");
		
		int i1 = 23;
		Long i2 = 23l;
		System.out.println(i2==i1);
		System.out.println(i2.equals(i1));
		
	}
	
	static void method(Object i) {
		System.out.println("int");
	}
	/*static void method(String i) {
		System.out.println("integer");
	}*/
	
	
	
	
}

class A {
	public A() {
		System.out.println("A");
	}
}

class B extends A implements Serializable{
	public B() {
		System.out.println("B");
	}
}

