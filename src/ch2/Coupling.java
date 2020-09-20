package ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coupling {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int sum = sum(num1,num2);
		
		//与sum，非直接耦合；
		//与main，数据耦合
		System.out.println(sum);
		
		Student student = new Student("qmx", "xs00115104", 'F');
		//与Student,特征耦合
		showStudentName(student);
		
		boolean flag = true;
		//与main,控制耦合
		outBasedOn(flag);
		
		//外部耦合
		new DBClass1().write();
		new DBClass1().write();
		
		//公共环境耦合
		Data.count = 10;
		
		//内容耦合
		System.out.println(student.id);
	}

	private static void outBasedOn(boolean flag) {
		if (flag) {
			System.out.println("true logic");
		} else {
			System.out.println("false logic");
		}
	}

	private static void showStudentName(Student student) {
		System.out.println(student.getName());
	}

	private static int sum(int num1, int num2) {
		return num1+num2;
	}
}

class Student{
	private String name;
	public String id;
	private char sex;

	public Student(String name, String id, char sex) {
		this.name = name;
		this.id = id;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
}
//DBClass1和DBClass2属于外部耦合
class DBClass1 {
	Connection con;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/sqltestdb";
	String user = "root";
	String password = "123456";
	public void write(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//............
	}
}
class DBClass2 {
	Connection con;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/sqltestdb";
	String user = "root";
	String password = "123456";
	public void read(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//............
	}
}
//公共环境耦合
class Data{
	public static int count = 10;
}


