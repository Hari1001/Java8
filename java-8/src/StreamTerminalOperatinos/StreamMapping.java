package StreamTerminalOperatinos;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapping {
	
	
	public static List<String> mapping()
	{
		return StudentDataBase.getAllStudents().stream().
		collect(Collectors.mapping(Student::getName, Collectors.toList()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mapping());
	}

}
