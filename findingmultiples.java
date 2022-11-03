import java.util.Scanner ;

public class findingmultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program that prints the multiples of 4 and 5 until the number reached which is taken by the user	
		Scanner input = new Scanner(System.in);

		//Defining variables 
		int i, k ;
		System.out.print("Enter the limit number: ");
		k=input.nextInt();
		
		//Finding the multiples of 4
		
		for(i=1; i<k; i*=4) {
			System.out.print(i + " ");	
		}
		
		System.out.print("\n");
		
		
		//Finding the multiples of 5

		for(i=1; i<k; i*=5) {
			System.out.print(i + " ");
		}


			
			
			
			
			
		/*takin input from the user
		System.out.print("Enter the limit number: ");
		Scanner input = new Scanner(System.in);
	
		do {
			
			
		}
		
		
		while(ad)
		*/
	}

}
