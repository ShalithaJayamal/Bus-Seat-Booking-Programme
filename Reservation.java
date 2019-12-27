import java.util.Date;
import java.util.Scanner;

public class Reservation {
	
	private static int[] seats = new int[56];

	public static void main(String[] args) {
		
		System.out.println("Welcome to Bus Sheet Bookking System!");
		System.out.println("");
		
		
		for(int i = 0 ;i < 52; i++)
		{
			seats[i] = 0;
			
		}
		
		Scanner s = new Scanner(System.in);
		int choice  = 1;
		
		System.out.println("Please enter 1 for window, 2 for aisle, or 0 to exit:");
		choice = s.nextInt();
		
		while(choice !=0)
		{
			int seatnumber = 0;
			
			if(choice == 1)
			{
				seatnumber =  bookWindow();
				
				if(seatnumber == -1)
				{
					seatnumber = bookAlise();
					
					if(seatnumber != -1)
					{
						System.out.println("Sorry ,We Can't Book Window Sheet .But Alise Sheet Available");
						//printBoardingPass(seatnumber);
					}
					
				}
				else
				{
					System.out.println("You Are Luckey,You Have booked Window Sheet!");
					//printBoardingPass(seatnumber);
				}
				
			}
			else if (choice == 2)
			{
				seatnumber =  bookAlise();
				
				if(seatnumber == -1)
				{
					seatnumber = bookWindow();
					
					if(seatnumber != -1)
					{
						System.out.println("Sorry ,We Can't Book Alise Sheet .But Window Sheet Available");
						printBoardingPass(seatnumber);
					}
					
				}
				else
				{
					System.out.println("You Are Luckey,You Have booked Window Sheet!");
					printBoardingPass(seatnumber);
				}
				
				
			}
			else
			{
				System.out.println("Select Correct Choice");
				choice = 0;

			}
			
			if(seatnumber == -1)
			{
				System.out.println("Sorry ,We Can't Book Alise Sheet or Window Sheet ");
				printBoardingPass(seatnumber);
			}
			
		}

	}
	
	private static int bookWindow()
	{
		for(int i = 0; i< 26 ;i++ )
		{
			if(seats[i] == 0 )
			{
				seats[i] = 1;
				return i +1;
				
			}
			
			
		}
		return -1;
	}
	private static int bookAlise()
	{
		for(int i = 0; i< 26 ;i++ )
		{
			if(seats[i] == 0 )
			{
				seats[i] = 1;
				return i +1;
				
			}
			
			
		}
		return -1;
	}
	
	private static void printBoardingPass(int seatnumber) {
		
		        Date timenow = new Date();
		
		        System.out.println();
		
		        System.out.println("Date: " + timenow.toString());
		
		        System.out.println("Boarding pass for seat number: " + seatnumber);
		
		        System.out.println("This ticket is non-refundable and non-transferable.");
		
		        System.out.println("Please be curteous, do not smoke. Enjoy your trip.");
		
		        System.out.println();
		
		    }

	

}
