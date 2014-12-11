package chap13;

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int Priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현제 스레드 이름 =" + name);
		System.out.println("현제 스레드 ID =" + id);
		System.out.println("현제 스레드 우선순위 =" + Priority);
		System.out.println("현제 스레드 상태 =" + s);
		// TODO Auto-generated method stub

	}

}
