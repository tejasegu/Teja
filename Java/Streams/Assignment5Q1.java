package teja;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
class Fruit {
	
	String name;
	int price;
	int calories;
	String color;
	
	public Fruit() {
		
	}
	
	public Fruit(String name, int price, int calories, String color) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static final List<Fruit> fruitslist = 
	Arrays.asList(
	new Fruit("Apple", 50, 250, "Red"),
	new Fruit("Banana",20, 200, "Yellow"),
	new Fruit("Kiwi", 20, 100, "Green"),
	new Fruit("Strawberry", 10, 200, "Red"),
	new Fruit("Blueberry", 10,500, "Blue"),
	new Fruit("Mango", 20, 550, "Yellow"),
	new Fruit("Orange", 50, 400, "Orange"),
	new Fruit("Grapes", 80, 60, "Green"),
	new Fruit("Watermelon", 50, 100, "Red"));

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", calories=" + calories + ", color=" + color + "]";
	} 
	
	
}

public class Assignment5Q1{

	public static List<String> reverseSort(List<Fruit> fruits){
		return fruits.stream().filter(f->f.getCalories()<300)
				.sorted(comparing(Fruit::getCalories)//.reversed()
					)
                .map(Fruit::getName)
                .collect(toList());	
	}
	
	public static  Map<Object, List<Fruit>> Sort(List<Fruit> fruitslist){
		return fruitslist.stream().collect(Collectors.groupingBy(w -> w.getColor()));	
	}
		
	public static ArrayList<Fruit> filterRedSortPrice(List<Fruit> fruitslist) { 
		return (ArrayList<Fruit>) fruitslist.stream().filter(f -> f.getColor().equals("Red"))
				.sorted(comparing(Fruit::getPrice))
               .collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		System.out.println("Fruits with calories<300");
		 reverseSort(Fruit.fruitslist).forEach(System.out::println);
		 System.out.println("Fruits sort by colour");
		System.out.println( Sort(Fruit.fruitslist));
		 System.out.println("Fruits with red colour sort by price");
		 filterRedSortPrice(Fruit.fruitslist).forEach(System.out::println);
		 
	
	
}
}
