package mythread;

public class TicketWindowRunnable implements Runnable{
	private final int MAX = 50;
	
	private int index = 1;
	@Override
	public void run() {
		while(index <= MAX){
			System.err.println(Thread.currentThread()+"当前叫号为："+index++);
		}
	}

}
