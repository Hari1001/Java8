package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerExample {
	
	public static void printName()
	{
		Consumer<Student> con=(student )->System.out.println(student);
		List<Student> studentList=StudentDataBase.getAllStudents();
		//studentList.forEach(con);
		System.out.println(studentList);
	}
	static List<Student> studentList=StudentDataBase.getAllStudents();

	static Consumer<Student> con=(student )->System.out.print(student.getName());
	static Consumer<Student> con4=(student )->System.out.println(student.getActivities());
	public static void listOfActivities()
	{
		//List<Student> studentList=StudentDataBase.getAllStudents();
		studentList.forEach(con.andThen(con4));  // this concept is called consumer check
		
	}
	
	
	static Predicate<Integer> p1=(i)->i%2==0;
	static Predicate<Integer> p2=(i)->i%5==0;
	
	public static void predicateAnd()
	{
		System.out.println(p1.and(p2).test(5));
		System.out.println(p1.or(p2).test(5));
		System.out.println(p1.and(p2).negate().test(5));
	}
	
	public static void listOfActivitiesandName()
	{
		//List<Student> studentList=StudentDataBase.getAllStudents();
		studentList.forEach(con.andThen(con4));  // this concept is called consumer check
		studentList.forEach((student->
		{
			if(student.getGradeLevel()>3 && student.getGpa()>3.9)
			{
				con.andThen(con4).accept(student);
			}
		}));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> con=(s)->System.out.println(s.toLowerCase());
		//con.accept("STRING");
		//printName();
		//listOfActivities();
	listOfActivitiesandName();
	predicateAnd();
	}

}
