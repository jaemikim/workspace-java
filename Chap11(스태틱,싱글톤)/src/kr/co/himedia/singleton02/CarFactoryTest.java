package kr.co.himedia.singleton02;


public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory carFactory = CarFactory.getInstance();
		Car car1 =  carFactory.cratCar();
		Car car2 =  carFactory.cratCar();
		
		System.out.println(car1.getCarNumber());
		System.out.println(car2.getCarNumber());		

	}
}
