package Stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class MapToObj {

	public static List<Integer> mapToObj()
	{
		return IntStream.rangeClosed(1, 5).mapToObj((i)->
		{
			return new Integer(i);
		}).collect(Collectors.toList());
	}
	
	public static long mapToLong()
	{
		 return IntStream.rangeClosed(1, 5).mapToLong((i)->i).sum();
	}
	
	public static OptionalDouble mapToDouble()
	{
		 return IntStream.rangeClosed(1, 5).mapToDouble((i)->i).average();
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println(mapToObj());
		System.out.println(mapToLong());
		System.out.println(mapToDouble());
	}
}
