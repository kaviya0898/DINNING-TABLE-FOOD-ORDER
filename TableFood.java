package Tablefood;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class TableFood extends WorkingClass{
 ArrayList<Integer> table=new ArrayList<Integer>();
 //TableFood food=new TableFood();
	public static void main(String[] args) {
		TableFood food=new TableFood();
		food.showTable();

	
	
	}
	public void showTable()
	{
		//ArrayList<Integer> table=new ArrayList<Integer>();
		Random rand=new Random();
		int tableNo;
		 table.add(1);
		System.out.println("\t\t\tWELCOME TO WILDFLOUR CAFE");
		System.out.println("Main Menu:");
		foodMenu1();
		System.out.println("Press 1 to book a Table");
		boolean bool=false;
		
		while(!bool) 
		{
			int menu=sc.nextInt();
		switch(menu)
		{
		case 1:
			tableBook();
			
			break;
		case 2:
			
			System.out.println("Press 1 for Milkshakes");
			System.out.println("Press 2 for Thickshakes");
			System.out.println("Press 3 for Icecream");
			System.out.println("Press 4 for Beverages");
			orderFood();
		case 3:
			bill();
			
			
		case 4:
			System.out.println("Do you want to book another table?");
		    System.out.println("Press 1 to book table or press 5 to close your booking");
		    break;
			
		case 5:
			System.out.println("Thank you for visiting");
			System.exit(0);
			bool=true;
			break;
		
			
	    }
	}
	}
	
public void tableBook()
{
	boolean bool=false;
	int choice;
	System.out.println("Enter the table number from(100-120)");
	choice=sc.nextInt();
	if(!(choice>=100&&choice<=120))
	{
		System.out.println("You entered a wrong table number");
		tableBook();
	}
	else {
	System.out.println("Please wait while we check is there any availability");
	if(table.contains(choice))
	{
	  System.out.println("Table is already booked");
	  System.out.println("Please choose another table");
	}
	

	else
	{
		System.out.println("Your table is booked");
		System.out.println("Now you can order food.");
		System.out.println("Press 2 to order food.");
		bool=true;
	}
	table.add(choice);
	bool=false;
}
}
	public void foodMenu1()
	{
		milkShake.put("Nutella shake",100);
     	milkShake.put("Ferrorocher",120);
     	milkShake.put("kitkat shake",130);
     	milkShake.put("Oreo shake",120);
     	System.out.println("----------------");
     	System.out.println("MILK SHAKES:");
     	System.out.println("----------------");
     	for(Map.Entry<String,Integer> entry1:milkShake.entrySet())
     	{
     		System.out.println(entry1.getKey()+"-----"+entry1.getValue());
     	}
     	System.out.println("----------------");
     	System.out.println("THICK SHAKES:");
     	System.out.println("----------------");
     	 
     	thickShake.put("Caramel butter",200);
     	thickShake.put("Mexican vennila",250);
     	thickShake.put("Very berry\t",200);
     	thickShake.put("Fig and almond",200);
     	for(Map.Entry<String,Integer> entry2:thickShake.entrySet())
     	{
     		System.out.println(entry2.getKey()+"-----"+entry2.getValue());
     	}
     	System.out.println("----------------");
     	System.out.println("ICE CREAMS:");
     	System.out.println("----------------");
     	
     	iceCream.put("Choclate overload",140);
     	iceCream.put("Swiss choclate",130);
     	iceCream.put("Cheese cake",150);
     	iceCream.put("Red velvet",160);
     	for(Map.Entry<String,Integer> entry3:iceCream.entrySet())
     	{
     		System.out.println(entry3.getKey()+"-----"+entry3.getValue());
     	}
     	System.out.println("----------------");
     	System.out.println("BEVERAGES:");
     	System.out.println("----------------");
     	
     	beverages.put("Choco batirol",250);
     	beverages.put("Cafe mocha",220);
     	beverages.put("Lychee juice",150);
     	beverages.put("Cappucino",180);
     	for(Map.Entry<String,Integer> entry4:beverages.entrySet())
     	{
     		System.out.println(entry4.getKey()+"-----"+entry4.getValue());
     	}
     	System.out.println("----------------");
     		
	}
}
	


