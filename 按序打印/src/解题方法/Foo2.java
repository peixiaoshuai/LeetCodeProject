package 解题方法;

import java.util.concurrent.CountDownLatch;

/**
 * 我们需要构造 2道屏障，second 线程等待 first 屏障，third 线程等待 second 屏障
 * 我们使用线程等待的方式实现执行屏障，使用释放线程等待的方式实现屏障消除。
 * @author pxs
 *
 */
public class Foo2 {
	private CountDownLatch countDownLatchA; 
	private CountDownLatch countDownLatchB ;
	public Foo2() {
		countDownLatchA = new CountDownLatch(1);
		countDownLatchB = new CountDownLatch(1);
	}
	public void first(Runnable printFirst) throws InterruptedException {
		printFirst.run();
		countDownLatchA.countDown();
		
	}
	public void second(Runnable printSecond) throws InterruptedException {
		countDownLatchA.await();
		printSecond.run();
		countDownLatchB.countDown();
	}

	public void third(Runnable printThird) throws InterruptedException {
		countDownLatchB.await();
		printThird.run();
		
	}
}
