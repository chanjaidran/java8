package lamba;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Predicate Test 
//Return Boolean
//Check Condition

public class Predicat {

	public static void main(String[] args) 
	{
		
		Predicate<Integer> p=(i)->(i>10);
		System.out.println(p.test(7));
		
	   Predicate<String> pr=name->(name.length()>3);
	   System.out.println(pr.test("jai "));
	   
	   System.out.println();
	   String[] names= {"Jaisiva","chan","vijay","AjayKumar"};
	  
	   for (String s : names)
	     {
		if(pr.test(s))
		{
		   	System.out.println(s);
	     }

	}
	   
	   Consumer<Integer> consumer=(a)->System.out.println(a);
	   consumer.accept(3);
	   
	   Function<Integer,String> function=(a)->{
		    return a+" jai";
	   };
	   

	  System.out.println(function.apply(4));
	  
	  
	  Supplier supplier=()->{return 2;};
	  supplier.get();
	  
}
	
}
