package switchblocks;

public class Switchblocks {

	public static void main(String[] args) {
		
		int number = 7;              // Switch-Blöcke  sind eine Kontrollstruktur zum steuern des Programmablaufs
		                             // Codeblock wird nicht anhand einer zu erfüllenden Bedingung ausgeführt, sondern anhand von Konstanten
		switch(number) {
		case 1: System.out.println("Number is 1"); break;      // break wird benützt um die Switch-Case abfolge bei erfüllung zu schließen
		case 2: System.out.println("Number is 2"); break;      // somit wird bei gleicher variable z.b. int = 2 = case 2 nur diese Zeile ausgeführt! 
		case 3: System.out.println("Number is 3"); break;       
		default: System.out.println("Number is not recognziable"); break;  // falls keine Variable passt wird die Default Zeile ausgeführt.
		}

		int month = 2;
		
		switch(month) {
		case 1: System.out.println("January"); break;      //Wenn break vergessen wird wird alles bis zum nächsten break ausgeführt 
		case 2: System.out.println("February"); break;     // Natürlich nur ab der Zeile die übereinstimmt und die switch-case abfolge startet
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		default: System.out.println("Other Month"); break;
		}
		
		String month1 = "March";                           // Statt int kann man auch mit String arbeiten 
		                                                   // Wichtig dabei ist das die Case Konstante ebenfalls ein Wort sein muss!  
		switch(month1) {
		case "January": System.out.println("January"); break;
		case "February": System.out.println("February"); break;     //Beispiel, zum herumspielen String wert Ändern!
		case "March": System.out.println("March"); break;
		case "April": System.out.println("April"); break;
		default: System.out.println("Other Month"); break;
		}
	}


}
