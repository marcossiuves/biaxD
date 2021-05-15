package test.chatbot;

public class CommandList {

	String response;
	
	public CommandList() {

	}


	public String justChatting(int messageType) {

		responses r = new responses();

		String response = r.allResponses[messageType + 1];
		this.response = response;
		
		return this.response;
	}
	
	public int typeResponse(String message) {
		
		responses r = new responses();
		
		String[] anws = r.allResponses;
		
		
		int position = 0;
		
		for(int count = 0; count <= anws.length; count++) {
			
			if(message.equalsIgnoreCase(anws[count])) {
				position = count;
				break;
			}
			
		}

		return position;
	}

	public String response(int moodValue, int typeResponse) {

		responses anws = new responses();

		if (moodValue == 0) {

			this.response = anws.allResponses[typeResponse + 1];

		}

		return this.response;
	}

}
