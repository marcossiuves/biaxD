package test.chatbot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String message = "";
		CommandList command = new CommandList();

		Scanner input = new Scanner(System.in);
		System.out.println("Inicio: ");
		while (!message.equalsIgnoreCase("sair")) {
			message = input.nextLine();
			int position = command.typeResponse(message);
			System.out.println(command.justChatting(position));
		}

		input.close();

	}
}
