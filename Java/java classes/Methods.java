package methods;

public class Methods {

	public static void main(String[] args) {     // public static void "main"  ist eine Methode mit der Variable main
		
	  // Eine Methode ist ein Stück vorprogrammierter Code, den wir immer wieder ausführen können ohne ihn jedes mal neu schreiben zu müssen
		
		System.out.println("Vor dem Methodenaufruf!");    // Println ist ebenfalls eine Methode, gekennzeichnet durch () nach der Variable !!
		doSomething();                                   // () = keine Definition  
		System.out.println("Nach dem Methodenaufruf!");
	
		System.out.println();                           // Leerzeile  (da wir mit 1D arrays arbeiten) 

		System.out.println("Beispiel 2 Anfang");
		doSomething1(5,10);                            // doSomething2 (5,10) beeinhaltet 2 Variablen als Definition 
		System.out.println("Ende des 2.Beispiels");   //  Variable 5 = number1 und Variable 10 = number2 (siehe Bsp2) 
		
	}
	                                         // Methode ohne Rückgabewert erkennbar an dem Parameter "void" 
	public static void doSomething () {     // public static void x = Methodenkopf aus 3 Schlüsselwörter + Variable (die frei benannt werden kann)
		int x = 5;                         //  Sobald die Methode aufgerufen wird, wird der Block{} ausgeführt 
		int y = 2;                        // In diesem Beispiel haben wir die Methode doSomething()  nicht definiert !! das passiert erst im {}
		int result = x + y;              // Was bei Änderung der Variablen x und y bedeuten würde ich müsste eine NEUE Methode programmieren
		System.out.println(result);     
		
	}                                       // Ende des Blocks mit } gekennzeichnet
	
	public static void doSomething1 (int number1, int number2) {  // Beispiel 2! 
		int x = number1;                                // Daher müssen wir auch beim Erstellen der Methode 2 Werte Definieren / int für Zahlen
		int y = number2;                               // Der große Vorteil an dieser Schreibweise ist das ich die 2 Variablen stets ändern kann 
		int result = x + y;                           // Ohne die Methode an sich umschreiben zu müssen
		System.out.println(result);                  // Die 2 Variablen die wir als Definition benützt haben werden nun für die Rechnung benützt
		                                            // Somit haben wir 2 mal eine einfache Addition die wir per Methode aufrufen können
		                                           // Jedoch sind bei Bsp2. die Variablen frei veränderbar ohne die Methode neu zu schreiben!!
	}
	
}


