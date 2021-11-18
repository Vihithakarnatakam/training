package com.ibm.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class personReflection {

	public static void main(String[] args) {
		person p = new person("thanu",23);
		System.out.println(p);
		
		Class c= p.getClass();
		System.out.println(c.getName());
		
		System.out.println("List of constructors--------");
		Constructor[] constructors = c.getConstructors();
		for(Constructor c1: constructors)
			System.out.println(c1);
		
		System.out.println("List of methods--------");
		Method[] methods = c.getDeclaredMethods();
		for(Method m: methods)
			System.out.println(m);
		
		System.out.println("List of fields--------");
		Field[] fields = c.getDeclaredFields();
		for(Field f: fields)
			System.out.println(f);
		
		
	}

}
