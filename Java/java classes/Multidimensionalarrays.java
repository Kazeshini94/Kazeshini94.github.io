package multidimensonalarrays;

public class Multidimensionalarrays {
	
	public static void main(String[] args) {

		
		// Mehrdimensionale Arrays  sind Datenstrukturen (Datensammlungen) 
		// Im Prinzip funktionieren sie normale Arrays jedoch haben wir hier mehrere Dimensionen mit denen man Arbeiten kann
		// Normales Array : (0)  / (1) / (2) / (3) / (4) (eindimensionales Array) Text wird in 1D wiedergegeben also einer Reihe oder Linie 
		
		// Mehrdimensionales Array :   (0|0) / (0|1) / (0|2) / (0|3) / (0|4)    in diesem Beispiel wird der Text in 2D wiedergegeben,
		                          //   (1|0) / (1|1) / (1|2) / (1|3) / (1|4)    also handelt es sich hierbei um ein 2 Dimensionales Array 
		                          //   (2|0) / (2|1) / (2|2) / (2|3) / (2|4)    weswegen wir auch eine Tabelle angezeigt bekommen.
		// 3D Array wäre dann ein Würfel jedoch wird in der Regel  meist mit 2 Dimensionen gearbeitet (Naturwissenschaften benützen zb. mehr) 
		
		
		String[][] firstAndLastName = new String[5][2];                 // Max 5 Zeilen  mit jeweils 2 Spalten 
		                                                               // Würde man 3 Dimensionen wollen würde man String[][][] schreiben usw.! 
		firstAndLastName[0][0] = "Franz";
		firstAndLastName[0][1] = "Bauer";
		
		firstAndLastName[1][0] = "Herbert";
		firstAndLastName[1][1] = "Meier";
		
		firstAndLastName[2][0] = "Seline";
		firstAndLastName[2][1] = "Dion";
		
		// äußere For-Schleife: Zeilenindex => i
		// innere For-Schleife: Spaltenindex => j
		
		for(int i = 0; i < firstAndLastName.length; i++) {
			for(int j = 0; j < firstAndLastName[i].length; j++) {     
				System.out.print(firstAndLastName[i][j] + " ");       // Print um die Namen nebeneinander anzeigen zu lassen
			}                                                        // + " " fügen wir hinzu um einen Abstand einzufügen 
			System.out.println();                                   // diese Befehlszeile ermöglicht den Zeilenumbruch nach jedem Namen 
			                                                       // da nach jedem Print{Name} der Println befehl aktiviert wird!
			
		}

    }
}