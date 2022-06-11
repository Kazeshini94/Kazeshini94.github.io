package vererbung;

public class Dog extends Animal {
	
/*  private String name;                     // Redundanter Code (Da Cat und Dog gleiche Attribute und Methoden aufweisen!!
	private int age;                         // Sehr umständlich und sehr anfällig für FEHLER  
	                                         // Um nicht so oft die selben Code zeilen wiederholen zu müssen verwendet man die Vererbung
	public void sleep() {                    //  siehe Cat für mehr Info!
		System.out.println("Schlafen..");	
	} */
		
	public void bark() {
		System.out.println("Wau Wau"); 
	}

}
