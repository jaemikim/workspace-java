package kr.co.himedia.stream07;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KeyaAmericano();
		kenyaAmericano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brewing();
//		System.out.println();
		
		Coffee kenyaMocha = new Mocha(new Latte(kenyaAmericano));
		kenyaMocha.brewing();
		
		Coffee kenyaWhipp = new WhippedCream(new Latte(kenyaAmericano));
		kenyaWhipp.brewing();
		System.out.println();
		System.out.println();
		
		
		Coffee ethiopiaAmericano = new EthiopiaAmericano();
		ethiopiaAmericano.brewing();
		System.out.println();
		
		Coffee ethiopiaLatte = new Latte(ethiopiaAmericano);
		ethiopiaLatte.brewing();
		
		Coffee ethiopiaMocha = new Mocha(new Latte(ethiopiaAmericano));
		ethiopiaMocha.brewing();
		
		Coffee ethipiaWhipp = new WhippedCream(new Latte(kenyaAmericano));
		ethipiaWhipp.brewing();
		System.out.println();
		System.out.println();
		
		
		Coffee ethiopiaAmericano1 = new WhippedCream(new Mocha(new Latte(new EthiopiaAmericano())));
		ethiopiaAmericano1.brewing();
		
	}
}
