package StreamTerminalOperatinos;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PartitioningBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> getPredicate= student -> student.getGpa()>3.8;
	Map<Boolean, Set<Student>> map=	StudentDataBase.getAllStudents().stream().
		collect(Collectors.partitioningBy(getPredicate,Collectors.toSet()));
System.out.println(map);
	}

}
