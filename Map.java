package lamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class Map {

	public static void main(String[] args) 
	{
		
		List<String> name=Arrays.asList("jai","siva","karthi","vijay");
		System.out.println(name);
		 
		
		name.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		
		List<Integer> numbers=Arrays.asList(2,3,4,5,6,7,10);
		numbers.stream().map(n->n*3).forEach(System.out::println);
		System.out.println();
		numbers.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.print(n+" ") );
		System.out.println();
		
		ArrayList<Products> products=new ArrayList<Products>();
		products.add(new Products(1, "Lenovo", 2000));
		products.add(new Products(2, "Dell", 4000));
		products.add(new Products(3, "Apple", 1000));
		products.add(new Products(4, "GoBook", 22000));
		
		
		System.out.println(products);
		
		products.stream().filter(n->n.getPrice()>20000).forEach(System.out::println);
		System.out.println("********");
		products.stream().filter(n->n.getPrice()>20000).map(n->n.getLaptopName()).forEach(System.out::println);
		
	long hOptional=	products.stream().collect(Collectors.maxBy(Comparator.comparing(Products::getPrice))).get().getPrice();
	System.out.println(hOptional);
	System.out.println("-----");
	products.stream().sorted(Comparator.comparing(Products::getPrice)).forEach(System.out::println);
	//products.stream().sorted().forEach(System.out::println);
	List<Products> employeesSortedList1=products.stream().sorted(Comparator.comparingLong(Products::getPrice).reversed()).collect(Collectors.toList());
	System.out.println();
	products.stream().sorted((o1,o2)-> (int)(o1.getPrice()-o2.getPrice())).forEach(System.out::println);
	System.out.println("/n");
	System.out.println(employeesSortedList1);
	System.out.println("/nnn");
	products.stream().sorted(Comparator.comparing(Products::getLaptopName).thenComparing(Products::getPrice)).forEach(System.out::println);
	
//	PriceCompare priceCompare=new PriceCompare();
//	Collections.sort(products,priceCompare);
//System.out.println(products);
	
 Products products2=	products.stream().filter(e->e.getLaptopName().contains("Dell")).findFirst().get();
 System.out.println("eeeeeeeeeee");
 System.out.println(products2);
 
 
 NameComparator compar=new NameComparator();
Collections.sort(products,compar);
System.out.println(products);


IdCopmare idcompare=new IdCopmare();
Collections.sort(employeesSortedList1, idcompare);
System.out.println(employeesSortedList1);


	
	}

}

class Products implements Comparable<Products>
{
	
	int id;
	String laptopName;
	long price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Products(int id, String laptopName, long price) {
		super();
		this.id = id;
		this.laptopName = laptopName;
		this.price = price;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", laptopName=" + laptopName + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Products o) {
		
		return (int) (this.price-o.getPrice());
	}


	}
	
	class IdCopmare implements Comparator<Products>
	{

		@Override
		public int compare(Products o1, Products o2) {
			
			if (o1.getId()>o2.getId()) {
				
				return 1;
			}
			else if ( o1.getId()<o2.getId()) {
				
				return -1;
			}
			
			else {
				return 0;
			}
		
		}
		
	}
	
	
	class PriceCompare implements Comparator<Products>
	{

		@Override
		public int compare(Products o1, Products o2) {
			
			if (o1.getPrice()>o2.getPrice()) {
				return 1;
			}
			
			else if (o1.getPrice()<o2.getPrice()) {
				return -1;
			}
			
			else {
				return 0;
						
			}
		}
	}
		
class NameComparator implements Comparator<Products>
{

	@Override
	public int compare(Products o1, Products o2) {
		
		return o1.getLaptopName().compareTo(o2.getLaptopName());
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
