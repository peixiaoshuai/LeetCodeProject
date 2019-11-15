package Test;

import 解题方法.Foo;
/**
 * 实现方法：
 * 	使用java1.8的新特性Lambda 表达式，代码看起来更加简洁，个人认为会降低程序可读性
 * @author pxs
 *
 */
public class Test{
	public static void main(String[] args){

		Foo foo = new Foo();
		Thread thread1 = new Thread(() -> {
			try {
				foo.first(() -> {
					System.out.println("one");

				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread thread2 = new Thread(() -> {
			try {
				foo.second(() -> {
					System.out.println("two");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread thread3 = new Thread(() -> {
			try {
				foo.third(() -> {
					System.out.println("third");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		thread3.start();
		thread2.start();
		thread1.start();
		
	}
}
