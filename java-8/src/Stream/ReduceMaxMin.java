package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMaxMin {

	public static  Optional<Integer> max(List<Integer> li)
	{
		//return li.stream().reduce(0,Integer::max);
		return li.stream().reduce((x,y)->x<y?x:y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li= Arrays.asList(1,2,3,4,9);
	//	System.out.println(max(li));
		Optional<Integer> option=max(li);
		if( option.isPresent())
		{
			System.out.println(option.get());
		}
	}

}
