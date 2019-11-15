package mythread;

public class TicketWindow extends Thread implements Runnable{
	
	
	
	public void run() {
		System.err.println("01111");
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new TicketWindow());
		thread.start();
	}
}
