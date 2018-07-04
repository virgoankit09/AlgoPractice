package problems;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import util.Employee;

public class ReadResolve {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Student instanceOne = Student.getInstance();
		
		// Serialize to a file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.txt"));
        out.writeObject(instanceOne);
        out.close();
        System.out.println("serialization done");
        instanceOne.sid = 20;
        instanceOne.i = 23;
        // Serialize to a file
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.txt"));
        Student instanceTwo = (Student) in.readObject();
        in.close();

        System.out.println(instanceOne.sid);
        System.out.println(instanceTwo.sid);
        System.out.println(instanceTwo.i);
	}
}

class StudentParentParent  implements Serializable{
	
	StudentParentParent()
	{
		System.out.println("contructor of grandfather");
	}
}

class StudentParent extends StudentParentParent {
	int i;
	
	StudentParent() {
		System.out.println("Parent");
	}
}

class Student extends StudentParent implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	 Student() {
		 //super(3);
		 System.out.println("constructor");
	 }
	
	int sid;
	
	private static final Student INSTANCE = new Student();
	
	public static Student getInstance() {
		return INSTANCE;
	}
	
	/*protected Object readResolve() {
		System.out.println("read resolve");
		return INSTANCE;
	}*/
	
}




