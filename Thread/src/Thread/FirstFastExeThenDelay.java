package Thread;
class C extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
		System.out.println("Running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	}

class D{
	void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
public class FirstFastExeThenDelay {

	public static void main(String[] args) throws InterruptedException {
		C c=new C();
		D d=new D();
		c.start();
		if(c.isAlive()) {
			System.out.println("Still alive");
		}
		d.run();
		c.join();
		if(c.isAlive()) {
			System.out.println("Still alive");
		}
		System.out.println("bye");
	}

}
