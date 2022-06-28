package Reflecion;

import java.lang.reflect.*;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

public class Reflecion {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("Reflecion.Reflecion");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			pirntParameters(parameters);
			System.out.println(")");
		} 
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName()+ ""+ field.getName());
			
		}
		System.out.println();
		
		System.out.println("[메소드 정보");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName()+ "(");
			Class[] parameters = method.getParameterTypes();
			pirntParameters(parameters);
			System.out.println(")");
		}

	}

	private static void pirntParameters(Class[] parameters) {
	   for(int i=0; i<parameters.length; i++) {
		   System.out.print(parameters[i].getName());
		   if(i<parameters.length - 1) {
			   System.out.println(",");
		   }
	   }
		
	}

}
