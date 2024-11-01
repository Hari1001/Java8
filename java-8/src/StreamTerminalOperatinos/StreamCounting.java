package StreamTerminalOperatinos;

import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class StreamCounting {

	public static Long couting()
	{
		return StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGpa()>3.9)
				.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		
		System.out.println(couting());

	}

}
