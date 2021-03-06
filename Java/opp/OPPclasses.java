package oppclasses;

public class OPPclasses {

	// Eine Klasse ist ein Bauplan für ein Objekt
	// Darin Definiert man die Eigenschaften/Attribute eines Objekts,
	// und welche Methoden (Funktionen) es ausführen kann.
	
	// Von einer Klasse können beliebig viele Objekte erstellt werden
	// Jedes dieser Objekte hat seine eigenen Attribute und kann seine Methoden selbständig ausführen.
	
	
	// Thema: Methoden in Klassen
	// Jede Methode wird innerhalb einer Klasse definiert!
	// bisher haben wir immer mit rein statischen Methoden programmiert (kursive schriftweise!) 
	
	public static void main(String[] args) {          // public "static" void  Da diese Klasse statisch ist und 
		                                             // Die Methode funktioniert ohne das ich vorher ein Objekt erstelle (Instanziiere)
		
		Car car1 = new Car();         // Instanz eines Objekts erstellt (Instanziierung)
        car1.drive();                // Aufruf der Methode (Ohne diese Zeile gibt auch die Konsole nichts aus)
       
        /* car1.color = "Gelb";              // diese 2 Zeilen Code funktionieren nicht da der Sichtbarkeitsmodifizierer auf private gestellt ist!
        System.out.println(car1.color); */  // daher auch die  /* */ | bei umstellung des Wertes auf public /* */ entfernen um den Code anzuzeigen!
        
        car1.setColor("Rot");                // Somit kann man das Problem der 2 Zeilen Code darüber lösen! Wir haben uns Setter und Getter erstellt 
        System.out.println(car1.getColor()); // Siehe für mehr Info zu diesen Klasse Car Code  
        
        
	}

	// Thema: Eigenschaft/Attribut
	// Eine Eigenschaft bzw. ein Attribut wird dazu verwendet, um eine Klasse zu beschreiben
	// Was unterscheidet ein Attribut von einer gewöhnlichen Variable? -> Sichtbarkeitsmodifizierer !! 
	
	// Schichtbarkeitsmodifizierer
	// Regelt die Zugriffsberechtigung auf das jeweilige Attribut von außen!
	// public, private , etc. regeln wer auf diese Werte Zugriff hat und welche Klassen diese aufrufen können!
	
	
}
