public class Main

{

	public static void main(String[] args)

	{

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		MessagePublisher p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
		p.notifyUpadte(new Message("Hi This is the first test Message")); // s1 and s2 will receive the update
		p.detach(s1);
		p.attach(s3);
		p.notifyUpadte(new Message("This is the second test Message")); // s2 and s3 will receive the update

	}

}
