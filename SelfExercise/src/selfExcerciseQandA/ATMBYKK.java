package selfExcerciseQandA;

import java.util.Scanner;

public class ATMBYKK {
	public static void main (String []args) {
		int Balance = 100000 , Debit = 0, Credit = 0 ;
		Scanner KK = new Scanner (System.in);

		while (true) {
			System.out.println("\nWelcome to the ATM Machine");
			System.out.println("Select an option:");
			System.out.println("A. Check Account balance");
			System.out.println("B. Credit account");
			System.out.println("C. Debit account");
			System.out.println("D. Exit");

			//int Select = KK.nextInt();
			Balance = KK.nextInt();
			Credit = KK.nextInt();
			Debit = KK.nextInt();

			if(Balance >= Debit)  
			{  
				Balance = Balance - Debit;  
				System.out.println("Please collect your money");  
			} 
			int TotalBalance = 0;
			if (Balance <= Credit) {
				Balance = Balance + Credit;
				System.out.println("Your Amount has been credited to your bank account XXXX");
			}
			if (Balance == Balance) {
				System.out.println("Your current total balance is ");	
			}

			else  
			{  
				System.out.println("Due inaccurate entries i am unable to answer your question ");  
			} 
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

