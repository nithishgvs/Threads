package org.nithish.threads;

public class DeadLockPractice {

	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread1 acquired lock1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread1 Waiting for lock2");
				synchronized (lock2) {
					System.out.println("Thread1 acquired lock2");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (lock2) {
				System.out.println("Thread2 acquired lock2");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread2 Waiting for lock1");
				synchronized (lock1) {
					System.out.println("Thread2 acquired lock1");
				}
			}
		}
	}
	

	public static void main(String... args) throws InterruptedException {
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.start();
		t2.start();

	}
}
