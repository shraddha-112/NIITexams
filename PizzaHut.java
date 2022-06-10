package exams;

import java.util.Scanner;

class Pizza
{
	String pizzabase;
	int price;
	Pizza(String base, int p)
	{
		pizzabase = base;
		price = p;
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price );
	}
	
}
class ChickenPizza extends Pizza
{
	String topping = "chicken";
	ChickenPizza(String base, int p)
	{
		super(base, p);
		
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price +"\nTopping ="+topping);
	}
	
}
class MuttonPizza extends ChickenPizza
{
	String flavouredtopping  = "Mutton";
	MuttonPizza(String base, int p)
	{
		super(base, p);
		
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price+"\nFlavoured Topping = "+flavouredtopping );
	}
}

public class PizzaHut {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
		System.out.print("Choose your pizza\nPress\n 1 ---> simple Pizza \n2 ---> Chicken Pizza\n3 ---> Mutton Pizza");
		int a = sc.nextInt();
		if(a== 1)
		{
			Pizza p1 = new Pizza("Thin", 100);
			System.out.print("Simple Pizza Price = "+ p1.price + " PizzaBase= " + p1.pizzabase);
		}
		else if(a== 2)
		{
			ChickenPizza p1 = new ChickenPizza("Thick", 200);
			System.out.print("Chicken Pizza Price = "+ p1.price + " PizzaBase= " + p1.pizzabase);
			
		}
		else if(a== 3)
		{
			MuttonPizza p1 = new MuttonPizza("flat", 300);
			System.out.print("Mutton Pizza Price = "+ p1.price + " PizzaBase= " + p1.pizzabase);
		}
		else
		{
			System.out.println("Enter valid number");
		}
	}

	}


