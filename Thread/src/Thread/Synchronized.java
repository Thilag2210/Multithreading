package Thread;
class cse extends Thread{
 synchronized public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("I am cse student");
		}
		}
}
class mech extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("I am mech student:");
		}
	}
}


public class Synchronized {

	public static void main(String[] args) {
		cse c=new cse();
		c.start();
		mech m=new mech();
		m.start();
		
			}

}
