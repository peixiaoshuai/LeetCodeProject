package mythread;

public class Bank {
	public static void main(String[] args) {
		Thread thread = new Thread(new TicketWindow());
		thread.start();
	}
}