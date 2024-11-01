package StreamTerminalOperatinos;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamJoining {
	
	public static String joining_1()
	{
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.joining());
		
	}

	public static String joining_2()
	{
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.joining("_"));
		
	}
	
	public static String joining_3()
	{
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.joining("_","{","}"));
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(joining_1());
		System.out.println(joining_2());
		System.out.println(joining_3());
	}

}
