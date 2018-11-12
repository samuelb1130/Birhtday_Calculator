import java.util.Scanner;

public class Birthday_Calculator {

/**
*
*	@ Sam Bauer 22
*	
**/	
	
	public static void main(String[] args) {
	
		
		Scanner bread = new Scanner (System.in);
		
		
		System.out.print("Hello, Welcome To Birhtday Calculator");
		
		System.out.println("\nPlease enter your name user 1");
		String name1 = bread.nextLine();
		
		System.out.println("\nPlease enter your name user 2");
		String name2 = bread.nextLine();
		
		System.out.println("\nUser l please enter your age as a whole number:   ");
		int age1 = Integer.parseInt(bread.nextLine());
		
		System.out.println("\nUser 2 please enter your age as a whole number:   ");
		int age2 = Integer.parseInt(bread.nextLine());
		
		if (age1 > age2)
		{
			System.out.println("\nUser 1 is older");
		}
		else if (age1 < age2)
		{
		
			System.out.println("\nUser 1 is younger than User 2");
		}
		else 
		{
			System.out.println("\nUsers have same year age");
		
			System.out.println("\nUser 1 please enter your birth year:  ");
			int year1 = Integer.parseInt(bread.nextLine());
			
			System.out.println("\nUser 2 please enter your birth year:  ");
			int year2 = Integer.parseInt(bread.nextLine());
			
			if (year1 > year2)
			{
				System.out.println("\nUser 1 is younger than User 2");
			}
			else if (year1 < year2)
			{
				System.out.println("\nUser 1 is older");
			}
			else 
			{
				System.out.println("\nUsers have same year age and same birth year");
				
				System.out.println("\nUser 1 please enter your birth month:  ");
				int month1 = Integer.parseInt(bread.nextLine());
				
				System.out.println("\nUser 2 please enter your birth month:  ");
				int month2 = Integer.parseInt(bread.nextLine());
				
				if (month1 > month2)
				{
					System.out.println("\nUser 1 is younger than User 2");
				}
				else if (month1 < month2)
				{
					System.out.println("\nUser 1 is older");
				}
				else 
				{
					System.out.println("\nUsers have same year age, same birth year and same month");
				
					System.out.println("\nUser 1 please enter your birth day:  ");
					int day1 = Integer.parseInt(bread.nextLine());
					
					System.out.println("\nUser 2 please enter your birth day:  ");
					int day2 = Integer.parseInt(bread.nextLine());
					
					if (day1 > day2)
					{
						System.out.println("\nUser 1 is younger than User 2");
					}
					else if (day1 < day2)
					{
						System.out.println("\nUser 1 is older");
					}
					else 
					{
						System.out.println("\nUsers are the same age");
					}

					System.out.println("\n\nEnd");
					
					
					

				}

			}}	}	

}
