package zählerschleife;

public class Zählerschleife {

	public static void main(String[] args) {
		                                  // For-Schleife
		for(int i = 5; i < 10; i++){     // 3-teilige Schleife  i = 0 wird nur einmal zu Beginn ausgeführt (Initialisierung der schleife bei 0) 
		                                //  i < 10 ist die Bedingung falls diese true ist wird der Block {} ausgeführt 
			                           //  i++ erhöht nach ausführung des Blocks {}  die Variable um 1  (i-- würde eine verminderung bewirken)
			System.out.println(i * 2);  //  ( i * 2 ) = Ergebniss das angezeigt wird *2 
		                               //  dies beeinflusst aber nicht die Variable an sich dies passiert nur durch i++ 
		}
		
		
	    for(int i = 1; i < 4; i++) {          // Hierbei ging es um Verschachtelung von Schleifen aka sie sind Kombinierbar
	    	for(int j = 1; j < 4; j++) {
	    		System.out.print("x ");       // Unterschied von Print und PrintLN  > Print lässt mich die Variablen nebeneinander anzeigen 
	    	}                                // PrintLN würde diese Variablen Untereinander anzeigen
	    	System.out.println();
	    }
	    

	}

}
