package lamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Reduce {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer sum=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println((double)sum/numbers.size());
		
	Integer addInteger=	numbers.stream().mapToInt(i->i).sum();
		System.out.println(addInteger);
		//method refernce
		Optional<Integer> sum1=numbers.stream().reduce(Integer::sum);
		System.out.println(sum1.get());
		
	Integer maxInteger=	numbers.stream().reduce(0, (a,b)->a>b?a:b);
	System.out.println(maxInteger);
	
	Optional<Integer> max= numbers.stream().reduce(Integer::max);
	System.out.println(max);
	
	Optional<Integer> min= numbers.stream().reduce(Integer::min);
	System.out.println(min);
	
        OptionalDouble avg=	numbers.stream().mapToDouble(i->i).average();
	System.out.println(avg+"avg");
	

	
	
	
	int arr[] = {22,32,42,52,62};
	List<Integer> tolist = new ArrayList<Integer>();
	System.out.println(tolist);
	for(int i:arr)
	{
		tolist.add(i);
	}
	System.out.println(tolist);
	
	long s=tolist.stream().mapToLong(i->i).sum();
	System.out.println(s);
	
	
	}

}
