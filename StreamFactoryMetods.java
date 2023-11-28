package lamba;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//of
//iterate
//genrate

public class StreamFactoryMetods {

	public static void main(String[] args) {
		
		
		Stream<Integer> streams=Stream.of(11,2,34,4,5,6,7);
		//streams.forEach(System.out::println);
		
		streams.forEachOrdered(System.out::println);
		Stream.iterate(2, x->x*2).limit(4).forEach(System.out::println);
		
		System.out.println("Summation");
	int sum=	IntStream.rangeClosed(1, 10).sum();
	System.out.println(sum);
	}
}
