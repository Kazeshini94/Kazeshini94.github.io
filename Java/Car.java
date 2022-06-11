package konstruktor;

public class Car {                     // Klasse Car = Auto-Bauplan

			//Eigenschaften/Attribute
			private String color;           // Farbe (Textwert daher String)
			private String brand;          // Marke
			private int horsePower;       // Ps-Zahl (Ganze Zahlenwerte daher int)
			
			public Car() {
				System.out.println("Auto wurde erzeugt.");
			}
			
			public Car(String color, String brand, int horsePower) { // Aufbau eines Konstruktors!
				this.color = color;                                 // Man Wählt einen Sichtbarkeitsmodifizierer, meist public + Namen der Klasse!
				this.brand = brand;                                // Standard-Konstruktor ist z.b. public Car() {} !!
				this.horsePower = horsePower;
	
			}
			
			//Methoden (Funktionen)
			public void drive(int speed) {                                
				System.out.println("Das Auto fährt " + speed + " km/h ");  
			}                                                     
			public void drive() {                                    
				System.out.println("Das Auto fährt... ");          
			}                                                      

			public void drive(int speed, String name) {                                    
				System.out.println("Hans fährt " + speed + " km/h mit dem Auto");          
				
                // Thema Überladen von Methoden
				// Man kann die Methode drive nicht einfach beliebig viele Parameter zuteilen 
				// Jedoch kann man die Signatur bzw die Parameter ändern um die Methode zu überladen	
				// z.b. drive() , drive(int speed), drive(int speed,String name) wäre erlaubt  
				// Der Computer prüft die Parameter von vorne nach hinten einzeln ab!
				// Solange sich die Parameter unterscheiden kann der Computer damit Arbeiten!!
				// Wobei nicht nur die Anzahl sondern auch die Typen(int, String, etc.) Wichtig sind!!
				
			}
			
			public String getColor() {              
				return color;                       
				                                  
			}                                     

			public void setColor(String color) {
				this.color = color;
			}

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public int getHorsePower() {
				return horsePower;
			}

			public void setHorsePower(int horsePower) {
				this.horsePower = horsePower;
			}
			
		}
