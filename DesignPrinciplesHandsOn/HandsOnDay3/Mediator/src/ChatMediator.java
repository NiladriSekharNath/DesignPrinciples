
import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users;

	public ChatMediator() {

		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(IUser user) {
		// TODO Auto-generated method stub
		users.add(user);

	}

	@Override
	public void sendMessage(String msg, IUser users) {
		// TODO Auto-generated method stub
		for (IUser u : this.users) {
			// message should not be received by the user sending it
			if (u != users) {
				u.receiveMessage(msg);
			}
		}
	}
}
