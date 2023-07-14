package Thread;
class com extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadName {

	public static void main(String[] args) {
	
		com c=new com();
		c.start();
		com c1=new com();
		c1.start();
	}

}
