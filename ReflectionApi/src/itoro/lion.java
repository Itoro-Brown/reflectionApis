package itoro;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class lion {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		String str = "MethodA";
		
		
	Method m =	lion.class.getMethod(str);
	
	m.invoke(m);

	}
	
	
	public static void MethodA() {
		
		System.out.println("This is inside Method A");
	}

}
