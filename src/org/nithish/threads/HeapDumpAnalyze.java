package org.nithish.threads;

import java.util.concurrent.TimeUnit;

public class HeapDumpAnalyze {

	public static void main(String[] args) throws InterruptedException {
		char[] array = new char[2000000000];
		TimeUnit.MINUTES.sleep(10000000);
		String str = new String(array);
		StringBuffer sb = new StringBuffer();
		sb.append(str);

	}

}
