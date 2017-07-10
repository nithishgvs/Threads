package org.nithish.threads;

public class Singleton {

	private static Singleton singletonObj;

	static {
		singletonObj = new Singleton();
	}

	private Singleton() {

	}

	private static Singleton getSingleton() {
		return singletonObj;
	}

	public void testSingleton(String str) {
		System.out.println("Its working " + str);
	}

	public static void main(String[] args) {
		Singleton single = Singleton.getSingleton();
		System.out.println(single);
		single.testSingleton("Hurray");

	}

}
