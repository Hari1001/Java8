package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxing {
	
	public static List<Integer> boxing()
	{
		return IntStream.range(1,10).boxed().collect(Collectors.toList());
	}

	public static int UnBoxing(List<Integer> li)
	{
		return li.stream().mapToInt(Integer::intValue).sum();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(boxing());
		
List<Integer> li=boxing();
System.out.println(UnBoxing(li));
	}

}
