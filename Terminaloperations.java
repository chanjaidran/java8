package lamba;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Terminaloperations {

	static Database dvDatabase=new Database();
	
	public static List<Phone> phonedb()
	{
		Phone phone1=new Phone(10000,1, "MI", Arrays.asList("ME 9A","Mi C12"));
		Phone phone2=new Phone(20000,2, "Realme", Arrays.asList("ME 9A","ME C12"));
		Phone phone3=new Phone(20000,3, "APPle", Arrays.asList("ME 9A","Mi C12"));
		Phone phone4=new Phone(29000,3, "MI", Arrays.asList("ME 9A","ME C12"));
		List<Phone> phones= Arrays.asList(phone1,phone2,phone3,phone4);
		return phones;
		
		
	}
	
	public static String joining1()
	{
	 
		return dvDatabase.getPhones().stream().map(Phone::getName).collect(Collectors.joining("---"));
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(joining1());
		dvDatabase.getPhones().stream().forEach(System.out::println);
		
		phonedb().forEach(System.out::println);
		System.out.println("Grouping By");
		Map<Integer, List<Phone>> resMap=phonedb().stream().collect(Collectors.groupingBy(Phone::getPrice));
		System.out.println(resMap);
		
		Map<String, List<Phone>> customizedMap=phonedb().stream().
				collect(Collectors.groupingBy(phone->phone.getPrice()>20000?"HighPrice":"Lowprice"));
		System.out.println(customizedMap);
		
		Map<List<String>, List<Phone>> custodMap=phonedb().stream().
				collect(Collectors.groupingBy(Phone::getModeList));
		System.out.println(custodMap);
	IntSummaryStatistics sumInteger=	phonedb().stream().collect(Collectors.summarizingInt(Phone::getPrice));
	System.out.println(sumInteger+"-----------");
	
		
		Map<String, Integer> cusp=phonedb().stream().collect(Collectors.groupingBy(Phone::getName,Collectors.summingInt(Phone::getId)));
		System.out.println(cusp);
		
		      LinkedHashMap<String, Set<Phone>> threearg = phonedb().stream().collect(Collectors.groupingBy(Phone::getName,LinkedHashMap::new,Collectors.toSet()));
		      System.out.println("------------------------//\\----------");
		      System.out.println(threearg);
		      System.out.println(threearg.getClass());
		      
		      Map<String, Long> c=phonedb().stream().collect(Collectors.groupingBy(Phone::getName,Collectors.counting()));
				System.out.println(c);
		 
				
			//	Map<Integer, Employee> empDupMap = employeeList.stream().collect(Collectors.toMap((e) -> e.getId(), Function.identity()));

				Map<Integer, Phone> empDupMap=phonedb().stream().collect(Collectors.toMap((e) -> e.getId(), Function.identity()
						,(emp, sameEmp) -> sameEmp)
						);
				System.out.println(empDupMap);
		  
	}
	
	
}








