package Stream;

import com.learnJava.data.StudentDataBase;

public class Match {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() > 3);

	}

	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() > 3);

	}

	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa() > 3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("checking AllMatch : " + allMatch());
		System.out.println("checking AnyMatch : " + anyMatch());
		System.out.println("checking AnyMatch : " + noneMatch());
	}

}
