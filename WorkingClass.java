package Tablefood;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class WorkingClass {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> food=new ArrayList<String>();
	ArrayList<Integer> quantity=new ArrayList<Integer>();
	ArrayList<Integer> table=new ArrayList<Integer>();
	HashMap<String,Integer> milkShake=new LinkedHashMap<>();
 	HashMap<String,Integer> thickShake=new LinkedHashMap<>();
 	HashMap<String,Integer> iceCream=new LinkedHashMap<>();
 	HashMap<String,Integer> beverages=new LinkedHashMap<>();
 	HashMap<String,Double>orderList=new LinkedHashMap();
 	
 	
	
	public void orderFood()
	{
		
		boolean bool=false;
		while(!bool)
		{
			int choice=sc.nextInt();
			switch(choice)
			{
			
			case 1:
				milkShake();
				break;
			case 2:
				thickShake();
				break;
			case 3:
				iceCream();
				break;
				
			
			case 4:
				beverages();
				break;
			case 5:
				bool=true;
				break;
			
		}
	}
}
	public void bill()
	{
		
		
			System.out.println("\t\t\tWILDFLOUR CAFE");
			System.out.println("------------------------------------------------");
			int one=0;
			
		
		System.out.println("ITEMS"+"\t\t\t\t"+"QUANTITY"+"\t\t"+"AMOUNT");
		int temp=1;
		for(Map.Entry<String,Double> entry1:orderList.entrySet())
     	{
			
     		System.out.println(temp+++"."+entry1.getKey()+"\t\t\t"+quantity.get(one++)+"\t\t\t"+entry1.getValue());
     	}
		System.out.println("-----------------------");
	double sum=0.0;
	int quanSum=0;
	for(double f:orderList.values())
	{
		sum+=f;
	}
	for(int i=0;i<quantity.size();i++)
	{
		quanSum+=quantity.get(i);
	}
	double sgst=(sum/100)*5;
	double cgst=(sum/100)*5;
	 System.out.println("TOTAL QUANTITY:"+quanSum+"\t\t\t"+"TOTAL:"+""+sum);
	 System.out.println("---------------------------------");
	 System.out.println("SGST:5%"+"\t\t\t"+sgst);
	 System.out.println("CGST:5%"+"\t\t\t"+sgst);
	 double roundTotal=sgst+cgst+sum;
	 System.out.println("GRANDTOTAL"+"\t\t\t"+roundTotal);
	 System.out.println("----------------------------------");
	 System.out.println("Thank you for visiting");
		System.exit(0);
	}
	
	
	public void milkShake()
	{
		ArrayList<String>list1=new ArrayList<String>(milkShake.keySet());
		ArrayList<Integer>list2=new ArrayList<Integer>(milkShake.values());
		System.out.println("----------------");
		int temp=1;
		for(Map.Entry<String,Integer> entry1:milkShake.entrySet())
     	{
     		System.out.println(temp+++"."+entry1.getKey()+"\t\t"+entry1.getValue());
     	}	
		System.out.println("----------------");
		System.out.println("Enter you desired option");
		int milkChoice=sc.nextInt();
		if(milkChoice==1||milkChoice==2||milkChoice==3||milkChoice==4)
		{
			list1.get(milkChoice-1);
			list2.get(milkChoice-1);
		}
		System.out.println("Enter the quantity you want");
		int quantity1=sc.nextInt();
		quantity.add(quantity1);
		double amount1=quantity1*list2.get(milkChoice-1);
		orderList.put(list1.get(milkChoice-1),amount1);
		System.out.println("Press 1 to continue ordering Milkshakes or");
		System.out.println("Press 2 to continue ordering otheritems or");
		System.out.println("Press 3 to finalize your bill");
		int choice=sc.nextInt();
		if(choice==1)
		{
			milkShake();
		}
		else if(choice==2){
		System.out.println("Press 1 for Milkshakes");
		System.out.println("Press 2 for Thickshakes");
		System.out.println("Press 3 for Icecream");
		System.out.println("Press 4 for Beverages");
		
	}
		else
		{
			bill();
		}
	}
	public void thickShake()
	{
		ArrayList<String>list3=new ArrayList<String>(thickShake.keySet());
		ArrayList<Integer>list4=new ArrayList<Integer>(thickShake.values());
		System.out.println("----------------");
		int temp=1;
		for(Map.Entry<String,Integer> entry1:thickShake.entrySet())
     	{
     		System.out.println(temp+++"."+entry1.getKey()+"\t\t"+entry1.getValue());
     	}	
		System.out.println("----------------");
		System.out.println("Enter you desired option");
		int thickChoice=sc.nextInt();
		if(thickChoice==1||thickChoice==2||thickChoice==3||thickChoice==4)
		{
			list3.get(thickChoice-1);
			list4.get(thickChoice-1);
		}
		System.out.println("Enter the quantity you want");
		int quantity2=sc.nextInt();
		quantity.add(quantity2);
		double amount2=quantity2*list4.get(thickChoice-1);
		orderList.put(list3.get(thickChoice-1),amount2);
		System.out.println("Press 1 to continue ordering Thickshakes or");
		System.out.println("Press 2 to continue ordering otheritems or ");
		System.out.println("Press 3 to finalize your bill");
		int choice=sc.nextInt();
		if(choice==1)
		{
			thickShake();
		}
		else if(choice==2){
		System.out.println("Press 1 for Milkshakes");
		System.out.println("Press 2 for Thickshakes");
		System.out.println("Press 3 for Icecream");
		System.out.println("Press 4 for Beverages");
		
	}
		else
		{
			bill();
		}
	}
	public void iceCream()
	{
		ArrayList<String>list5=new ArrayList<String>(iceCream.keySet());
		ArrayList<Integer>list6=new ArrayList<Integer>(iceCream.values());
		System.out.println("----------------");
		int temp=1;
		for(Map.Entry<String,Integer> entry1:iceCream.entrySet())
     	{
     		System.out.println(temp+++"."+entry1.getKey()+"\t\t"+entry1.getValue());
     	}	
		System.out.println("----------------");
		System.out.println("Enter you desired option");
		int iceChoice=sc.nextInt();
		if(iceChoice==1||iceChoice==2||iceChoice==3||iceChoice==4)
		{
			list5.get(iceChoice-1);
			list6.get(iceChoice-1);
		}
		System.out.println("Enter the quantity you want");
		int quantity3=sc.nextInt();
		quantity.add(quantity3);
		double amount3=quantity3*list6.get(iceChoice-1);
		orderList.put(list5.get(iceChoice-1),amount3);
		System.out.println("Press 1 to continue ordering Icecreams or");
		System.out.println("Press 2 to continue ordering otheritems or");
		System.out.println("Press 3 to finalize your bill");
		int choice=sc.nextInt();
		if(choice==1)
		{
			iceCream();
		}
		else if(choice==2){
		System.out.println("Press 1 for Milkshakes");
		System.out.println("Press 2 for Thickshakes");
		System.out.println("Press 3 for Icecream");
		System.out.println("Press 4 for Beverages");
		
	}
		else
		{
			bill();
		}
	}
	public void beverages()
	{
		ArrayList<String>list7=new ArrayList<String>(beverages.keySet());
		ArrayList<Integer>list8=new ArrayList<Integer>(beverages.values());
		System.out.println("----------------");
		int temp=1;
		for(Map.Entry<String,Integer> entry1:beverages.entrySet())
     	{
     		System.out.println(temp+++"."+entry1.getKey()+"\t\t"+entry1.getValue());
     	}	
		System.out.println("----------------");
		System.out.println("Enter you desired option");
		int bevChoice=sc.nextInt();
		if(bevChoice==1||bevChoice==2||bevChoice==3||bevChoice==4)
		{
			list7.get(bevChoice-1);
			list8.get(bevChoice-1);
		}
		System.out.println("Enter the quantity you want");
		int quantity4=sc.nextInt();
		quantity.add(quantity4);
		double amount4=quantity4*list8.get(bevChoice-1);
		orderList.put(list7.get(bevChoice-1),amount4);
		System.out.println("Press 1 to continue ordering Beverages or");
		System.out.println("Press 2 to continue ordering otheritems or");
		System.out.println("Press 3 to finalize your bill");
		int choice=sc.nextInt();
		if(choice==1)
		{
			beverages();
		}
		else if(choice==2)
		{
		System.out.println("Press 1 for Milkshakes");
		System.out.println("Press 2 for Thickshakes");
		System.out.println("Press 3 for Icecream");
		System.out.println("Press 4 for Beverages");
		
	}
		else
		{
			bill();
		}
	}
}

