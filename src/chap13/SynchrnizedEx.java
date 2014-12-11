package chap13;

public class SynchrnizedEx {

	public static void main(String[] args) {
		SyncObject obj = new SyncObject();
		
		Thread th1 = new WorkerThread("kitae", obj);
		Thread th2 = new WorkerThread("hyosoo", obj);
		Thread th3 = new WorkerThread("kim", obj);
		
		th1.start();
		th2.start();
		th3.start();
		
		class SyncObject {
			int sum =0;
			Synchronized void add() {
				int n = sum;
				Thread.currentThread().yield();
				n +=10;
				sum = n;
				System.out.println(Thread.currentThread().getName()+":"+sum);
			}
			int getSum() {return sum;}
			}
		class WorkerThread extends Thread {
			SyncObject sObj;
			
			WorkerThread(String name, SyncObject sObj) {
				super(name);
				this.sObj = sObj;
			}
			public void run() {
				int i = 0;
				while(i<10) {
					sObj.add();
					i++;
				}
			}
		}
		

	}

}
