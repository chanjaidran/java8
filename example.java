package lamba;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class example {

	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(11,3,43,12,98);
		System.out.println(list);
		list.forEach(System.out::println);
		System.out.println();
		list.forEach((n)->System.out.print(n+ " "));
		
		list.sort(Integer::compareTo);
		System.out.println(list);
		
		
		Car car=()->System.out.println("Hello Car going");
		car.go();
		
		Add add=(a,b)->a+b;
		System.out.println(add.add(3, 1));
		
		Add add2=(a,b)->{
			return a-b;
		};
		
		System.out.println(add2.add(10, 6));
		
		Say s=(messsage)->{
			String name="Jai";
			String retS=messsage.concat(name);
			return retS;
		};
		
		System.out.println(s.say("Hello"));
		
		Predicate<Integer> predicate=(a)->(a%2==0);
		System.out.println(predicate.test(99));
		
		Function<Integer,Double> function=(a)->a/2.0;
	function=function.andThen(a->3*a);
			
		System.out.println(function.apply(10));
		
		Consumer<Integer> consumer=(a)->System.out.println(a);
		consumer.accept(1);
		
		Supplier<String> supplier=()->{return "Hi";};
		System.out.println(supplier.get());
		
	}
	
	
	
	
	

}

interface Car
{
	public void go();
}

interface Add
{
	public int add(int a,int b);
}


interface Say
{
	public String say(String message);
}