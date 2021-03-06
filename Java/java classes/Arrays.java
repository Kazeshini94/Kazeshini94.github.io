package arrays;

public class Arrays {

	public static void main(String[] args) {
		/*                                              // Arrays sind ähnlich wie Variablen
		String test = "Hendrik", "paul";               // Bei einer Variablen ist es nicht möglich mehrere Werte zu speichern
		     System.out.println(test);                // Dafür gibt es Arrays, diese sind Datenstrukturen die mehrere Werte beinhalten können
		*/                                           // Der Zugriff auf diese Werte erfolgt über einen Index
        
		String[] names = new String [4];            // Die Größe eines Arrays wird immer bei der Initialisierung festgelegt
	         
		names[0] = "Hendrik";                       // Beim Programmieren wird beim Zählen immer von 0 weg gezählt!  
	    names[1] = "Paul";                        
	    names[2] = "Fabienne";                      // New String 4 bestimmt die maximale Größe  auf 4 Variablen die abgespeichert werden können  
	    /*
	    System.out.println(names[2]);
	    */                                // /* */  ermöglicht das auskommentieren von Codezeilen somit werden sie im Programm nicht berücksichtigt
	    
	    
		
		for(int i = 0; i < names.length; i++) {   // .length = ein String Attribut  / i < x wäre ebenso valide gewesen jedoch sehr umständlich
			System.out.println(names[i]);         // names.lenght hat den Vorteil immer das Ganze Array zu zählen (the whole lenght) 
			                                      // In diesem Beispiel verwenden wir eine For-Schleife um alle Variablen des Arrays wiederzugeben.
		                                          // Bei undefinierten Werten erhalte ich den Wert Null
		}
	
	}

}
