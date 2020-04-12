package com;

public class SampleDemo implements Runnable {
	private Thread t;
	private String threadNmae;

	public SampleDemo(String threadName) {
		// TODO Auto-generated constructor stub
		this.threadNmae = threadName;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(threadNmae);
			i++;
		}

	}

	public static boolean anagram(String a, String b) {

		for (int i = 0; i < a.length(); i++) {
			int c1 = 0;
			int c2 = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j))
					c1++;
				if (a.charAt(i) == b.charAt(j))
					c2++;
			}
			if (c1 != c2)
				return false;
		}

		return true;
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadNmae);
			t.start();
		}
	}

}
