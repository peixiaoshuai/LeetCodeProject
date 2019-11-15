package Test;

import 解题方法.Foo2;
/**
 * 实现方法：
 * 	使用传统匿名内部类方法实现，代码比较乱且多，但是可读性会比较多
 * @author Simon.Hoo
 *
 */
public class Test2{
	public static void main(String[] args){
		Foo2 foo = new Foo2();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					foo.first(new Runnable() {
						@Override
						public void run() {
							System.err.print("one");

						}
					});
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					foo.second(new Runnable() {
						@Override
						public void run() {
							System.err.print("two");

						}
					});
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					foo.third(new Runnable() {
						@Override
						public void run() {
							System.err.println("three");

						}
					});
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		thread2.start();
		thread3.start();
		thread1.start();
	}
}
