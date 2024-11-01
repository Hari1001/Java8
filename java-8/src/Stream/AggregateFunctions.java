package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateFunctions {

	public static Optional<Integer> min()
	{
		List<Integer> li=Arrays.asList(2,3,5,6);
		 //return li.stream().reduce((x,y)->x<y?x:y);
		return li.stream().reduce(Integer::min);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Integer> value=min();
		System.out.println(value);
		int in=IntStream.range(1, 50).sum();
		
	//	System.out.println(in);
		
		OptionalInt option = IntStream.range(1, 50).max();
		 //System.out.println(option.isPresent()?option.getAsInt():0);
		 
		 OptionalLong option2 = LongStream.range(1, 50).min();
		// System.out.println(option2.isPresent()?option2.getAsLong():0);
		
		 
		 OptionalDouble option3 = IntStream.range(1, 50).average();
			 System.out.println(option3.isPresent()?option3.getAsDouble():0);
			 
			 
			
	}

}
