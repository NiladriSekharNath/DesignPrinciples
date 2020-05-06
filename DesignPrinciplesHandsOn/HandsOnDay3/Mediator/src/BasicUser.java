public class BasicUser implements IUser {

	private ChatMediator chatMediator;
	private String name;

	@Override
	public void sendMessage(String msg) {
		System.out.println(this.name + ": Sending Message=" + msg);

		chatMediator.sendMessage(msg, this);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println(this.name + ": Received Message:" + msg);
	}

	public BasicUser(ChatMediator chatMediator, String name) {

		this.chatMediator = chatMediator;
		this.name = name;

	}

}
