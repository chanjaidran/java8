package lamba;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {

	public static void main(String[] args) {
		
		List<Integer> arrayList=Arrays.asList(2,3,3,4,2,6,7,10,11);
		
		arrayList.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));
		
		
		
		 List<String> lines = Arrays.asList("java", "c", "python");

	        List<String> result = lines.stream()       // convert list to stream
	                .filter(line -> !"c".equals(line)) // we dont like c
	                .collect(Collectors.toList());     // collect the output and convert streams to a List

	        result.forEach(System.out::println); 
	        
	        lines.stream().filter(s->(!s.equals("c"))).forEach(System.out::println);
	        
	        lines.stream().filter(x->x!="java").forEach(System.out::println);
	        System.out.println("Distincr");
	     Set<Integer> sets =  arrayList.stream().collect(Collectors.toSet());
		System.out.println(sets);
		Stream.of("jai","kar");
	}

}
