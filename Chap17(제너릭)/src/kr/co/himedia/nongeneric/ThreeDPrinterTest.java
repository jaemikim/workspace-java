package kr.co.himedia.nongeneric;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();		
		Powder powder = new Powder();
		printer1.setMaterial(powder);
//		System.out.println(powder);
//		System.out.println(printer1);
		
		Powder powder2 = printer1.getMaterial();
		System.out.println(powder2);
		
		System.out.println();
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		printer2.setMematerial(plastic);
		
		Plastic plastic2 = printer2.getMematerial();
		System.out.println(plastic2);
		
		System.out.println();
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		printer3.getMaterial();
		
		Powder powder3 = (Powder) printer3.getMaterial();
		System.out.println(powder3);
		
		System.out.println();
		
		printer3.setMaterial(plastic);
		Plastic plastic3 = (Plastic) printer3.getMaterial();
		System.out.println(plastic3);
		
		
	}
}
