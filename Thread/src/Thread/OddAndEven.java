package Thread;
class uniq extends Thread{
	public void run() {
		System.out.println("The Even Numbers are:");
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
class tech extends Thread{
	public void run() {
		System.out.println("The odd Numbers are:");

		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}

public class OddAndEven {

	public static void main(String[] args) throws InterruptedException {
	
		uniq u=new uniq();
		u.start();
		u.join();

		tech t=new tech();
		t.start();
	}

}
