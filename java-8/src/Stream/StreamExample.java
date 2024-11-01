package Stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> gpaPredicate=(student)->student.getGpa()>3.9;
		Function<Student, String> getName=(student)->student.getName();
		
		Function<String,String> fun= (s)->s.toUpperCase();

		Map<String, List<String>> MapList = StudentDataBase.getAllStudents().stream()
				.filter(gpaPredicate).collect(Collectors.toMap(getName, Student::getActivities));
		System.out.println(MapList);

	}

}
