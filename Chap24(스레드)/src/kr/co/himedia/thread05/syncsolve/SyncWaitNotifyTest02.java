package kr.co.himedia.thread05.syncsolve;

import java.util.ArrayList;

class HiMediaBookstore {
	
	public ArrayList<String> shelf = new ArrayList<>();
	public HiMediaBookstore() {
		shelf.add("인공지능 기반 자연어 처리 1");
		shelf.add("인공지능 기반 자연어 처리 2");
		shelf.add("인공지능 기반 자연어 처리 3");
//		shelf.add("인공지능 기반 자연어 처리 4");
//		shelf.add("인공지능 기반 자연어 처리 5");
//		shelf.add("인공지능 기반 자연어 처리 6");
	}
	public synchronized String lendBook() throws InterruptedException {
		if(shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + " 빌리는 것 기다림 시작");
			wait();
			System.out.println(Thread.currentThread().getName() + " 빌리는 것 기다림 종료");
		}
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() + " : " + book + " 빌림");
		return book;
	}
	
	public synchronized void retrunBook(String book) {
		shelf.add(book);
		notify();
		System.out.println(Thread.currentThread().getName() + " : " + book + " 반납함");
	}
}

class Person extends Thread {
	public Person(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			
			String title = SyncWaitNotifyTest02.hmBookstore.lendBook();
			if (title == null) return;
			Thread.sleep(5000);
			SyncWaitNotifyTest02.hmBookstore.retrunBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}

public class SyncWaitNotifyTest02 {
	
	public static HiMediaBookstore hmBookstore = new HiMediaBookstore();
	
	public static void main(String[] args) {
		
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		Person person6 = new Person("person6");
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
		
	}

}
