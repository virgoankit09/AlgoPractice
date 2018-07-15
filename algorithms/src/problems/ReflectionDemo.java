package problems;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	void show() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Students obj = Students.getInstance();
		Class name = obj.getClass();
		//System.out.println(name);
		
		//System.out.println(name.getSimpleName());
		
		Constructor[] c = name.getDeclaredConstructors();
		System.out.println(c.length);
		//System.out.println(c.getParameters());
		//Object s2 = c.newInstance();
		//System.out.println(s2.getClass());
		c[0].setAccessible(true);
		Students s2 = (Students)c[0].newInstance("");
		
		Method[] methods = name.getDeclaredMethods();
		System.out.println(methods.length);
		for(Method method : methods) {
			System.out.println(method.getName());
			method.setAccessible(true);
			method.invoke(s2, null);
		}
		
		//Students s = new Students("");
		
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		new ReflectionDemo().show();
	}
	
}

class Students {
	private String name;
	private String school;
	
	private static Students INSTANCE = new Students();
	
	private Students() throws NullPointerException {
		System.out.println("student constructor");
	}
	
	private Students(String name) throws NullPointerException {
		System.out.println("student constructor");
	}
	
	public void display() {
		System.out.println("display");
	}
	
	private void test() {
		System.out.println("test");
	}
	
	public static Students getInstance() {
		return INSTANCE;
	}
	
}