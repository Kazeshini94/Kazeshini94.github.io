package vergleichsoperatoren;

public class Vergleichsoperatoren {

	public static void main(String[] args) {
		
		if(3<4) {                              
	    System.out.println("correct answer");   // If-Anfragen  funktionieren so das sie alles nach dem  { nur wiedergeben wenn das ergebnis true ist
			
		}                                       // Hier ist das Ende der If-Anfrage
		
		
		if(5<4) {
			System.out.println("correct answer");   // wie man bei Ausführung des Programms sieht wird diese Zeile nicht wiedergegebn
		}                                          // da das Ergebnis der If-Anfrage False ergibt!
		
		int age = 17;                              // So wäre age  17 und somit false das Ergebnis der if anfrage 
		age = age + 1;                            // Durch diesen Zusatz wird das Ergebnis  auf true geändert und der If-Text angezeigt
		
		if(age > 17) {
			System.out.println("congrats to your 18th birthday");
		}
		else {
			System.out.println("youre sadly still 17");     // alles was nach else{ kommt  wird nur angezeigt wenn die If-Abfrage false ist! 
			
		}                                                  // Das ende des else{ commands 
		
	}

}
