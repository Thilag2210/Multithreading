package Thread;

class A{
	void apple() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Apple..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B{
	void banana() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

public class Threadsleep {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		a.apple();
		b.banana();
	}

}
