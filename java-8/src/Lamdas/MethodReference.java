package Lamdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
Function<String,String> fun= (s)->s.toUpperCase();
Function<String,String> fun1= String::toUpperCase;

int value=6;
public void consumer()
{
	int value=4;
	Consumer<String> con=(s)->
	{
		this.value++;
	//	value++;
		s.toLowerCase();
	};
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference method= new MethodReference();
	String val=method.fun.apply("java");
	String val2=method.fun1.apply("javasdf");
	
	System.out.println(val+val2);
	}

}
