package 解题方法;

/**
 * 我们需要构造 2道屏障，second 线程等待 first 屏障，third 线程等待 second 屏障
 * 我们使用线程等待的方式实现执行屏障，使用释放线程等待的方式实现屏障消除。
 * @author pxs
 *
 */
public class Foo {
	private boolean firstFinished;
	private boolean secondFinished ;
	private Object lock = new Object();
	public Foo() {

	}
	public void first(Runnable printFirst) throws InterruptedException {
		synchronized (lock) {
			printFirst.run();
			firstFinished = true;
			lock.notifyAll();
		}
	}
	public void second(Runnable printSecond) throws InterruptedException {
		synchronized (lock) {
			while(!firstFinished){
				lock.wait();
			}
			printSecond.run();
			secondFinished = true;
			lock.notifyAll();
		}
	}

	public void third(Runnable printThird) throws InterruptedException {
		synchronized (lock) {
			while(!secondFinished){
				lock.wait();
			}
			printThird.run();
		}
	}
}
