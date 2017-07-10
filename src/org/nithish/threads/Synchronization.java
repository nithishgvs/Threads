package org.nithish.threads;

public class Synchronization implements Runnable {
	
	 public volatile int counter = 0;

	public void run() {
		method();
	}

	private synchronized void method() {
		for (int i = 0; i < 3; i++) {
			counter=counter+i;
			System.out.println("Value of i: " + i + " .Being executed by: " + Thread.currentThread().getName()+" Counter :"+counter);
			try {
				this.wait(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Synchronization sync = new Synchronization();
		Thread t1 = new Thread(sync, "Thread-1");
		Thread t2 = new Thread(sync, "Thread-2");
		t1.start();
		t2.start();

	}

}
