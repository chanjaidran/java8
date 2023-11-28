package lamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,3);
		List<Integer> lis1t=Arrays.asList(5,7);
		List<Integer> list2=Arrays.asList(11,13);
		
		List<List<Integer>> lists=Arrays.asList(lis1t,list,list2);
	List<Integer> newlisList=	lists.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(newlisList);
		
		
		List<Products> products1=new ArrayList<Products>();
		products1.add(new Products(1, "Lenovo", 20000));
		products1.add(new Products(2, "Dell", 40000));
		
		List<Products> products2=new ArrayList<Products>();
		products2.add(new Products(3, "Apple", 104000));
		products2.add(new Products(4, "GoBook", 220000));
		
	List<List<Products>> productList=Arrays.asList(products1,products2);
	//System.out.println(productList);
	
	List<String> newlist=productList.stream().flatMap(x->x.stream()).map(n->n.getLaptopName()).collect(Collectors.toList());
	System.out.println(newlist);
	
	  Database dbDatabase=new Database();
	List<String> phoneStrings=  dbDatabase.getPhones().stream().map(Phone::getModeList).flatMap(x->x.stream())//.flatMap(List::stream)
			.distinct().sorted().collect(Collectors.toList());

	System.out.println(phoneStrings);
	}

}


class Phone
{
	@Override
	public String toString() {
		return "Phone [price=" + price + ", id=" + id + ", name=" + name + ", modeList=" + modeList + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getModeList() {
		return modeList;
	}
	public void setModeList(List<String> modeList) {
		this.modeList = modeList;
	}
	
	int price;
	
	public Phone(int price, int id, String name, List<String> modeList) {
		super();
		this.price = price;
		this.id = id;
		this.name = name;
		this.modeList = modeList;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	int id;
	String name;
	public Phone(int id, String name, List<String> modeList) {
		super();
		this.id = id;
		this.name = name;
		this.modeList = modeList;
	}
	List<String> modeList=new ArrayList<String>();
}

class Database
{
	public List<Phone> getPhones()
	{
		Phone phone1=new Phone(1, "MI", Arrays.asList("ME 9A","Mi C12"));
		Phone phone2=new Phone(2, "Realme", Arrays.asList("ME 9A","ME C12"));
		List<Phone> phones= Arrays.asList(phone1,phone2);
		
		return phones;
	}
}
