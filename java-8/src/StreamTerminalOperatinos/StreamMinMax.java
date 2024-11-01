package StreamTerminalOperatinos;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMinMax {
	
	public static Optional<Student> minBy()
	{
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxBy()
	{
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(minBy());
			System.out.println(maxBy());
	}

}
