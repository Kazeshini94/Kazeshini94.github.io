package oppclasses;

public class Car {                     // Klasse Car = Auto-Bauplan

	//Eigenschaften/Attribute
	private String color;           // Farbe (Textwert daher String)
	private String brand;          // Marke
	private int horsePower;       // Ps-Zahl (Ganze Zahlenwerte daher int)
	
	//Methoden (Funktionen)
	public void drive() {                 // Methode drive wird erstellt. beachte das fehlende "static" = keine statische Methode!! 
		                                 // Somit muss für diese Methode erst ein Objekt erstellt (Instanziiert) werden!
		                                // Funktionalität sollte zur gewünschten Klasse passen. Auto kann fahren! passt!! 
		System.out.println("Das Auto fährt...");
	}

	public String getColor() {              // Setter und Getter kann man selbst schreiben oder per Source von Ecplise erstellen lassen!!
		return color;                      // Diese benützt man für Kontrollierte Zugriffe 
		                                  // Wichtig um ungewollte Änderung der Attribute in der Klasse zu verhindern!
	}                                    // Man könnte hier noch Validierungen und Bedingungen hinzufügen bzw was beachtet werden soll! 

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	// Alles was wir für diese Klasse brauchen sollte in diesem Code definiert werden!
	// Diese Klasse für sich führt nichts aus. Es ist ein reiner Bauplan den wir im Verwenden können!!
}
