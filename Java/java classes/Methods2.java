package methods2;

public class Methods2 {

	public static void main(String[] args) {            
		
		System.out.println("Beispiel 1 Anfang");       // Ausdruck der Methode mit Rückgabewert aka Bsp.3 
		System.out.println(doSomething(10, 20));      // doSomething2(10, 20); würde das Ergebniss nicht Verarbeiten deswegen wäre die Zeile leer
        System.out.println("Ende des 1.Beispiels");  //  Daher haben wir eine Println-Methode benützt um den Wert zu Verarbeiten

        System.out.println(); 
        
        System.out.println("Beispiel 2 Anfang");                    // Bei Bsp.3 wurde das Ergebniss direkt in der Konsole Ausgegebn 
		int resultFromMethodDoSomething = doSomething(25, 35);     // Man kann dieses Ergebniss auch dauerhaft als neue Variable speichern!
		System.out.println(resultFromMethodDoSomething);          // Somit kann man mit dieser Variablen weiterarbeiten
		System.out.println("Ende des 2.Beispiels");         
		                 
		                     // Sehr Wichtig !! Es wird 2 mal die Methode doSomething verwendet jedoch bekomme ich 2 unterschiedliche Werte
		                    // die Werte der Variablen sind frei änderbar, die Methode definiert nur was mit diesen Werten passiert!!
       }                   // um zu Verdeutlichen warum Bsp.2 aus methods praktischer zu programmieren ist!
		
		public static int doSomething (int number1, int number2) {  // Methode mit Rückgabewert !!
                                                                   // Parameter: Jeder Datentyp "int" "String" "double" etc.
			int result = number1 + number2;                       // Bei dieser Schreibweise spart man sich 2 Zeilen Code ansonsten identisch zu Bsp.2
			return result;                                       // Man könnte sich noch eine Zeile sparen wenn man return number1 + number2; schreibt
        }                                                       // Somit wird direkt ein Ausdruck returned!
	}


