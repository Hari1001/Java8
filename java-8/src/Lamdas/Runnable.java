package Lamdas;

import java.util.Comparator;
import java.util.function.Consumer;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
new Thread(()-> System.out.println("Running")).start();

Comparator<Integer> compare=(a,b)->a.compareTo(b);
System.out.println(compare.compare(3, 4));

	}

}
