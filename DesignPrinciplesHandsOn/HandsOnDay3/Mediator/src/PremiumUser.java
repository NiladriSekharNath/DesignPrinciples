public class PremiumUser implements IUser {

	private ChatMediator chatMediator;
	private String name;

	public void receiveMessage(String msg) {
		System.out.println(this.name + ": Received Message:" + msg);
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println(this.name + ": Sending Message=" + msg);

		chatMediator.sendMessage(msg, this);
	}

	public PremiumUser(ChatMediator chatMediator, String name) {

		this.chatMediator = chatMediator;
		this.name = name;
	}

}
