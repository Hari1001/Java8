package StreamTerminalOperatinos;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsGroupingBy {
	
	public static void onegroupingBy()
	{
		Map<String, List<Student>> studentlist =StudentDataBase.getAllStudents().stream().
		collect(Collectors.groupingBy(Student::getGender));
		
		
		Map<String, List<Student>> studentlist1 =StudentDataBase.getAllStudents().stream().
				collect(Collectors.groupingBy(student ->student.getGpa() >3.8 ? "Outstanding" : "Average"));
				
		System.out.println(studentlist);
	}
	
	public static void twogroupingBy2()
	{
		Map<Integer, Map<Object, List<Student>>> studentMap =StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student ->student.getGpa() >3.8 ? "Outstanding" : "Average")));
	
		System.out.println(studentMap);
	}

	public static void twogroupingBy3()
	{
		Map<String, List<Student>> studentMap =StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName));
					
	
		System.out.println(studentMap);
	}

	public static void twogroupingBy4()
	{
		Map<String, Integer> studentMap =StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,
						Collectors.summingInt(Student::getNoteBooks)));
					
	
		System.out.println(studentMap);
	}

	public static void threeArgumentVersion()
	{
		LinkedHashMap<String, Set<Student>> studentMap =StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
	
		System.out.print(studentMap);
	}
	
	
	public static void calcTopGPA()
	{
		Map<Integer,Optional<Student>> s=StudentDataBase.getAllStudents().stream().
		collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//groupingBy();
		//twogroupingBy4();
		calcTopGPA();
		//threeArgumentVersion();
	}

}
