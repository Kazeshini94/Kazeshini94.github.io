package konstruktor;

public class Konstruktor {

	public static void main(String[] args) {
		
		// Der Konstruktor ist IMMER die erste Methode, die beim instanziieren eines Objektes aufgerufen wird
		// Er wird meistens dazu verwendet, um Attribute zu initialisieren (bereitet ein Objekt vor)
		// Aufgabe des Konstruktors: Objekt konstruieren (erstellen) 
		// Jede Klasse hat einen Konstruktor

		Car car1 = new Car("Rot", "VW", 130);         // Instanziierung eines Objekts  
		System.out.println(car1.getColor());          // Ausführung der Get Methode zum Aufrufen der Eigenschaft!
		
		car1.drive(20, "Hans");                       // Durch Überladen der Methode entscheidet der Computer nun je nach Angaben der Parameter
		                                              // wie das Problem bzw die Aufgabe zu lösen ist! 
		// drive() Wert ändern um das Überladen der Methode in der Praxis zu sehen!! 
		
		Car car2 = new Car();                         // Man kann auch den Konstruktor überladen! 
		
	    //"new "Car()"" würde den Standard-Konstruktor ausführen 
        // Wir haben in der Klasse Car einen Konstruktor definiert daher wird der Standart Konstruktor nicht mehr ausgeführt!!
		// Daher müssen wir diese Werte auch beim erstellen des Objekts definieren!
        
        
	}

}
