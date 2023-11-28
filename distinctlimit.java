package lamba;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class distinctlimit {

	public static void main(String[] args) {
	
		//Distinct
		List<String> namelist=Arrays.asList("jai","jai","JAI","karthi","jai","siva");
		namelist.stream().map(n->n.toLowerCase()).distinct().forEach(System.out::println);
		
		//count
		long count=namelist.stream().distinct().count();
		System.out.println(count);
		
		//limit
		namelist.stream().limit(4).forEach(n->System.out.println(n));
		

		List<Integer> arrayList=Arrays.asList(2,3,4,5,6,7,10);
		Optional<Integer> minOptional=arrayList.stream().min((a,b)->{return a.compareTo(b);});
				System.out.println(minOptional.get());
				
				Optional<Integer> maxOptional=arrayList.stream().max((a,b)->{return a.compareTo(b);});
				System.out.println(maxOptional.get());
				
				Object[] arr=arrayList.stream().toArray();
				System.out.println(arr);
				
				for(Object a:arr)
				{
					System.out.println(a);
				}
	}

}
