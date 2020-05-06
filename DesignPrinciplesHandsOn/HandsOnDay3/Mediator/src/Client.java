
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChatMediator chatMediator = new ChatMediator();
		IUser user1 = new BasicUser(chatMediator, "Mr X");

		IUser user2 = new BasicUser(chatMediator, "Mr Y");

		IUser user3 = new PremiumUser(chatMediator, "Mr T");

		IUser user4 = new PremiumUser(chatMediator, "Mr Z");

		chatMediator.addUser(user1);

		chatMediator.addUser(user2);

		chatMediator.addUser(user3);

		chatMediator.addUser(user4);

		user1.sendMessage("Hiya !!!");

	}

}