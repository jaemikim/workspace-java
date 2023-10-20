package kr.co.himedia.thread;

/*
 * 20미만 짝수 출력(0, 2, 4, ~ 18) 1초
 * 10미만 수 출력 (9~1) 0.5초
 */
public class MultiThreadTest {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {				//20미만 짝수 출력			
			for(int i = 0; i < 20; i+=2)
			System.out.print(i + ", ");
			try {
				Thread.sleep(1000);				//1000밀리세컨드(1초) 쉼
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		};
		
		Runnable task2 = () -> {				//10미만 수 출력
			for(int j = 9; j > 0 ; j--)
			System.out.print("("+ j +")");			
			try {
				Thread.sleep(500);				//500밀리세컨드 쉼
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		};
		
		Thread thread = new Thread(task1);
		thread.start();
		Thread thread1 = new Thread(task2);
		thread1.start();
	}
}

