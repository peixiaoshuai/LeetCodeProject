package mythread;

public class Bank2 {
	public static void main(String[] args) {
		final TicketWindowRunnable runnable = new TicketWindowRunnable();
		
		Thread t1 = new Thread(runnable, "一号柜台");
		Thread t2 = new Thread(runnable, "二号柜台");
		Thread t3 = new Thread(runnable, "三号柜台");
		t1.start();
		t2.start();
		t3.start();
	}
}
