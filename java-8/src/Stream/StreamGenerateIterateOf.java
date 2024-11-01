package Stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerateIterateOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stre=Stream.of("check", "verify", "validate");
		stre.forEach(System.out::println);
		
		//Stream.iterate(1, x->x*2).limit(20).forEach(System.out::println);
		
		Supplier<Integer> supply=new Random()::nextInt;
		Stream.generate(supply).limit(5).forEach(System.out::println);
	}

}
