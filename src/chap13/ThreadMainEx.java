package chap13;

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int Priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("���� ������ �̸� =" + name);
		System.out.println("���� ������ ID =" + id);
		System.out.println("���� ������ �켱���� =" + Priority);
		System.out.println("���� ������ ���� =" + s);
		// TODO Auto-generated method stub

	}

}
