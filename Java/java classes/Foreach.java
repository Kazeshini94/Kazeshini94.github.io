package foreach;

public class Foreach {

	public static void main(String[] args) {
		
		// Schleifentyp, um Datenstrukturen (Arrays) schrittweise zu durchlaufen
        // Speichert bei jedem Durchlauf eine Kopie des aktuellen Wertes der Datenstruktur in einer Variable, 
		// welche man im Schleifenkörper wiederverwenden kann
		// Wichtig!! NUR lesender Zugriff möglich!                          
	    
		/*                                           
		String[] names = new String [3];            // Das Array kann auch wie im nächsten Schritt geschrieben werden          
		names[0] = "Hendrik";                      // Beide Bedeuten in diesem Beispiel exakt das selbe 
	    names[1] = "Paul";                        // new String [3] erstellt zuerst ein leeres Objekt dem wir Wertigkeiten zuteilen 
	    names[2] = "Fabienne";                       
	    
	    */  
		
		String[] names =  {"Hendrik", "Paul","Fabienne"};    // Abgekürzte Schreibweise für die Array Initialisierung
		                                                    // vorteilhalft wenn man genau weiß mit welchen und wievielen Werten man arbeitet!
		
		for(int i = 0; i < 3; i++) {                  // For-Schleife mit umständlicher Schreibweise, 
			System.out.println(names[i]);            // i < 4 würde mir einen Fehler nach Fabiennne ausgeben
			                                        // Da wir nur 3 Werte ( Hendrik , Paul , Fabienne ) gegeben haben!
		}
		
		for(String name : names) {               // Foreach-Schleife gibt das selbe wie die For-Schleife darüber wieder
			System.out.println(name);           // Die Variable name ist jedoch nicht veränderbar da diese Schleife rein zum Auslesen benützt wird 
		}                                      // Die Variable name ist eine Kopie des Wertes names! 
		         
	}
}
