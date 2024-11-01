package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkip {
	
	public static Optional<Integer> limit(List<Integer> li)
	{
		return li.stream().limit(3).reduce((x,y)->x+y);
		
	}
	
	public static Optional<Integer> skip(List<Integer> li)
	{
		return li.stream().skip(2).reduce((x,y)->x+y);
		
	}
	
	
	
	public static void main(String args[])
	{
		List<Integer> li= Arrays.asList(1,3,4,6,7,9);
		Optional<Integer> option=limit(li);
		if(option.isPresent())
			
		{
			System.out.println(option.get());
		}
		Optional<Integer> option2=skip(li);
if(option2.isPresent())
			
		{
			System.out.println(option2.get());
		}
	}

}
