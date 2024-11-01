package Stream;



import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FindFirstAny {

	public static Optional<Student> findFirst() {
		return StudentDataBase.getAllStudents().stream().
				filter(student -> student.getGpa() > 3).findFirst();

	}


	public static Optional<Student> findAny() {
		return StudentDataBase.getAllStudents().stream().
				filter(student -> student.getGpa() > 3).findAny();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Student> findFirst=findFirst();
		Optional<Student> findAnyStudent=findAny();
		if(findFirst.isPresent())
		{
			System.out.println(findFirst.get().getName());
		}
		
		if(findAnyStudent.isPresent())
		{
			System.out.println(findAnyStudent.get());
		}
		
		
	}

}
