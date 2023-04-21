package Activity;

class Multihraed implements Runnable {
	Thread Cooking;
	private String IoT;

	Multihraed(String name) {
		IoT = name;
	}

	@Override
	public void run() {
		System.out.println("Thread running" + IoT);
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println(IoT);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Sleep {
	public static void main(String[] args) {
		MultiThraed thread1 = new MultiThraed("Thread1");
		thread1.start();
		MultiThraed thread2 = new MultiThraed("Thread2");
		thread2.start();
	}
}
