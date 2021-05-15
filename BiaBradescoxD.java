package c10;

import java.util.Scanner;

public class BiaBradescoxD {

	public static void main(String[] args) {

		String message;

		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.print("Você: ");
			message = input.nextLine(); 
					
			if (message.contains("pinto")) {
				
				System.out.println("Machista!");
			}
			
			if(message.equalsIgnoreCase("sair")) {
				break;
			}
		}
	
		
		input.close();
	}

}
