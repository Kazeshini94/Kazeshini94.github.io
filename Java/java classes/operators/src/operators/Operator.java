package operators;

public class Operator {

	public static void main(String[] args) {
		 
		int number1 = 3 + 4;          // 3 + 4 = ein Ausdruck ist immer eine Rechnung die ein Ergbegniss liefert nicht das Ergebniss selbst
		System.out.println(number1);
		
		int number2 = 3 - 4;          // Basic Rechnungen werden mit den Operatoren durchgeführt 
		System.out.println(number2);
		
		int number3 = 3 * 4;
		System.out.println(number3);
		
		int number4 = 5 / 4;           // Nachkomma Stellen werden nicht angezeigt bei int und auch nicht gerundet! 
		System.out.println(number4);
		
		int result = number1 + number2; 
		System.out.println(result);    // int result  ist einfach eine zweite möglichkeit Rechnungen(Operationen) durchzuführen  
		
		
		int number11 = 32 % 3;         // % zeigt mir den Restwert nach der Division an  funktioniert nur für ganze Zahlen
		System.out.println(number11);
	}

}