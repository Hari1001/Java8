package StreamTerminalOperatinos;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}

	public static double averaging() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
		System.out.println(averaging());
	}

}
