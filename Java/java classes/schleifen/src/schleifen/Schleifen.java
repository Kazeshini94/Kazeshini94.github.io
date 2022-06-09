package schleifen;

public class Schleifen {

	public static void main(String[] args) {
		
		int number = 6;                      //Besonderheit der While-Schleife = Kopfgesteuerte Schleife 
		                                     //Das Programm prüft bei jeder Ausführung ob die Bedingung gegeben ist 
		
		while(number <= 5) {                 // Solange das Ergebnis true ist  wird der Code Block {} ausgeführt 
			System.out.println(number);      // While-schleifen laufen solange bis das Ergebnis false ist und sind Boolesche Anfragen (If-Anfragen)
			number += 1;                     // number += x ist eine Kurzschreibweise von  Number = Number + x  
			                                 // number++; funktioniert nur bei 1) 
			
		}                 
		
		int number1 = 9;                    
		
		do                                   // Do-while Schleife ist eine Fußgesteuerte Schleife 
		{                                    // Auch wenn die Bedingung von Anfang an nicht erfüllt ist  wird diese 1 mal ausgeführt    
			System.out.println(number1);     // Da erst am Ende des Programmablaufs  die Bedingung überprüft wird 
			number1++;
		}
		while(number1 <=5);                  // Beispiele sind beide auf False zur Vorführung der Do-While Schleife 

	}

}
