package selfExcerciseQandA;
/*
 Write a code to implement ATM machine.
 1. Take initial amount as 1,00,000/- rs operation/cases 
    A. Check Account balance
    B. Credit account by 5,500 /- rs and display current balance after credit in account.
    C. Debit account by 7,000 / - rs and display current balance again after debiting the amount
    D. if above operation are done then exit.
 */
public class ATMmachine {

	public static void main (String args []) {
		int AcutualBalance = 100000 ;
		int AccountBalance = AcutualBalance;
		int CreditAmount = 5500 ;
		int TotalBalance = AccountBalance + CreditAmount ;
		int DebitAmount = 7000;
		 int TotalNewBalance = TotalBalance - DebitAmount ;
		

		//  Nested If loop :
		if ( AcutualBalance  == 100000) {
			if (AccountBalance == AcutualBalance) {
				System.out.println(" Account Balance is  = " + AccountBalance);

				if ( AccountBalance + CreditAmount == TotalBalance  ) {
					System.out.println(" After Crediting Amount Total Balance is  = " + TotalBalance );

					if (TotalBalance - DebitAmount == TotalNewBalance ) {
						System.out.println(" After Debiting Amount Total New Balance is  = " + TotalNewBalance);
						return ;
					}	
					else {
						System.out.println("Exiting Code due to conditions are not satisfied");
					}
				}
			}
		}
	}
}
