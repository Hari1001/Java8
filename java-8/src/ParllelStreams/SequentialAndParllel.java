package ParllelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialAndParllel {
	
	 
	public static long rangeCheck(Supplier<Integer> supplier, int range)
	{
		
		long startTime= System.currentTimeMillis();
		for(int i=0;i<range;i++)
		{
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
	
		return endTime-startTime;
		
	}

	public static int sum_Sequential_stream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}

	public static int sum_parllel_stream() {
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("Parllel check : "+rangeCheck(SequentialAndParllel::sum_parllel_stream, 20));
		System.out.println("Sequential check : "+rangeCheck(SequentialAndParllel::sum_Sequential_stream, 20));
	}

}
