package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreams {
	
	public static int instream()
	{
		return IntStream.rangeClosed(1, 6).sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li= Arrays.asList(1,2,3,4,5,6);
	//	System.out.println(instream());
		
		IntStream in=IntStream.range(1, 50);
		//in.forEach((value-> System.out.print(value+" ")));
		
		System.out.println(in.count());
		
		System.out.println(IntStream.rangeClosed(1, 50).count());
		
		LongStream lon=LongStream.range(1, 50);
	//	lon.forEach(value->System.out.print(value+" "));
		IntStream.range(1, 50).asDoubleStream().forEach(value->System.out.print(value+" , "));
	}

}
