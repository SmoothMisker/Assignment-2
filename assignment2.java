import java.util.Scanner;

public class assignment2 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int answer = (int) Math.floor(Math.random()*100 + 1);
		System.out.println(answer);
		int counter = 0;
		
		while(counter < 5) {
			System.out.print("Enter a guess: ");
			int guess = scan.nextInt();
			System.out.print("\n");
			
			if(guess <= answer + 10 && guess >= answer - 10) {
				System.out.print(answer);
				break;
			}
			if(counter < 5){
				counter++;
			}else {
				System.out.println("Keep guessing!");
			}
		
		}
		
		if(counter == 5) {System.out.print("Sorry! " + answer);}
		
		
		
		
	}
}
