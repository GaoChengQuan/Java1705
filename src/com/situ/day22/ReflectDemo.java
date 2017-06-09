package com.situ.day22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.Class.forName(类路径);
		Class clazz1 = Class.forName("com.situ.day22.Person");
		//2.类名.class
		Class clazz2 = Person.class;
		//3.对象.getClass()
		Person person = new Person("zhangsan");
		Class clazz3 = person.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);
	}
	
	@Test
	public void constructorTest() throws Exception {
		Class clazz = Person.class;
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
			//System.out.println(constructor.getName());
		}
		System.out.println("------------");
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		
	}

	@Test
	public void constructorTest1() throws Exception {
		//Person person = new Person();
		//person.setName("lisi");
		Class clazz = Person.class;
		Constructor constructor = clazz.getDeclaredConstructor();
		//调用构造方法，实例化对象
		Person person = (Person) constructor.newInstance();
		//person.setName("lisi");
		//String.class,Person.class,Student.class都是Class的实例
		Method setNameMethod = clazz.getDeclaredMethod("setName", new Class[]{String.class});
		setNameMethod.invoke(person, new Object[]{"lisi1111"});//等价于person.setName("lisi");
		System.out.println(person);
	}
	
	@Test
	public void methodTest() {
		Class clazz = Student.class;
		//返回当前类和父类所有的public的方法
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("-----------");
		//返回当前类所有的方法包含private
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
	}
	
	@Test
	public void testChangeFiled() throws IllegalArgumentException, IllegalAccessException {
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		changeFiled(teacher);
		System.out.println(teacher);
	}
	
	public void changeFiled(Object object) throws IllegalArgumentException, IllegalAccessException {
		//1.获得对应的Class
		Class clazz = object.getClass();
		//2.获取所有的Fields
		Field[] declaredFields = clazz.getDeclaredFields();
		//3.遍历所有的Field，如果是String类型，将包含b的改成a
		for (Field field : declaredFields) {
			//3.1如果是String类型的才修改
			if (field.getType() == String.class) {
				//3.2 获取Field的值
				field.setAccessible(true);//设置私有的可以访问
				//person.name
				String oldValue = (String) field.get(object);
				//3.3将获得的值中的b改为a
				String newValue = oldValue.replace("a", "b");
				System.out.println(newValue);
				//3.3将修改后的值设置到Field
				field.set(object, newValue);//person.setName(newVlaue);
			}
		}
	}
}
