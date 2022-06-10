package study;


import  java.util.*;
class Pizza
{
	String pizzabase;
	int price;
	Pizza(String pibase, int pri)
	{
		pizzabase = pibase;
		price = pri;
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price );
	}
	
}
class ChickenPizza extends Pizza
{
	String topping = "chicken";
	ChickenPizza(String pibase, int pri)
	{
		super(pibase, pri);
		
	}
	void display()
	{
		System.out.println("PizzaBase:"+pizzabase+"\nPrice:"+price +"\nTopping ="+topping);
	}
	
}
class MuttonPizza extends ChickenPizza
{
	String flavouredtopping  = "Mutton";
	MuttonPizza(String pibase, int pri)
	{
		super(pibase,pri);
		
	}
	void display()
	{
		System.out.println("PizzaBase: "+pizzabase+"\nPrice: "+price+"\nFlavoured Topping = "+flavouredtopping );
	}
}

public class PizzaHut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pizza p1 = new Pizza("Thin", 100);
		ChickenPizza c1 = new ChickenPizza("Thick", 200);
		MuttonPizza M1 = new MuttonPizza("flat", 300);
		while(true) {
		System.out.println("Plan Pizza Price:" + "  "+ p1.price);
		System.out.println("Chicken Pizza Price:" + "  "+ c1.price);
		System.out.println("Mutton Pizza Price:" + "  "+ M1.price);
		System.out.println("Enter Your Choice 1-4:");
    	System.out.println("1- Plan Pizza");
    	System.out.println("2- Chicken Pizza");
    	System.out.println("3- Mutton Pizza");
        System.out.println("4- To Exit");
        
        
		int a = sc.nextInt();
		if(a== 1)
		{
			p1.display();
		}else if(a== 2)
		{
			c1.display();
			
		}
		else if(a== 3)
		{
			M1.display();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		}
	}

}