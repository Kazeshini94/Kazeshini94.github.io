import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Kino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = {"Batman", "A beautiful Mind", "Titanic"};       // All available options to create Movies!
        String[] time = {"20:15", "19:30", "22:30"};                                    // Add new parameter here!!
        String[] room = {"Saal 1", "Saal 2", "Saal 3"};
        String[] quality = {"2D", "3D"};

        String[] movie = new String[3];                                                         // Build Movie here!!
        movie[0] = name[0] + " | " + quality[0] + " | " + room[0] + " | " + time[0]; // Batman
        movie[1] = name[1] + " | " + quality[1] + " | " + room[1] + " | " + time[1]; // A beautiful Mind 3D
        movie[2] = name[2] + " | " + quality[0] + " | " + room[2] + " | " + time[2]; // Titanic

        String ticket;
        boolean available;                       // Availability of the Movie (that day?) !Always true right now!

        /*
                                                                                    Nicht die Richtige Lösung !
        System.out.printf(form, movie[0], time[0], quality[1], room[0],available);  Bei Auswahl des Films soll auch
        System.out.printf(form, movie[1], time[1], quality[0], room[1],available);  der Saal etc. mitgeladen werden!
        System.out.printf(form, movie[2], time[2], quality[1], room[2],available);
        */

        for (int i = 0; i < movie.length; i++) {
            available = !movie[i].equals(movie[1]);                         //  The way IntelliJ tells me to solve it !
            /*                                                                                             VS
            if (movie[i].equals(movie[1])) {                                                  My own way to solve it !
                available=false;
            }else {                                                              Same Result = IntelliJ saves me Code!
                available=true;                                                             just to set one to false!!
            }
             */
            System.out.print(movie[i] + (available ? " Verfuegbar \n" : " Ausgebucht \n"));
        }

        System.out.println("\nWelchen Film moechten sie sehen?");                                        // User-Input
        ticket = sc.nextLine();

        while (ticket.isEmpty() ||// New film needs to be added here too!!
                !(ticket.equalsIgnoreCase(name[0])                            // .equalsIgnorecase() = lower&upperCase
                        || ticket.equalsIgnoreCase(name[1])
                        || ticket.equalsIgnoreCase(name[2])
                        || ticket.equalsIgnoreCase("exit") )
        ) {
            System.out.println("Wrong Input! \nUse available Film or Exit");
            ticket = sc.nextLine();
        }
        if (ticket.equalsIgnoreCase(name[0])) {                            // New Film means new else if!
            ticket = movie[0];
        } else if (ticket.equalsIgnoreCase(name[1])) {
            ticket = movie[1];
        } else if (ticket.equalsIgnoreCase(name[2])) {
            ticket = movie[2];                                                // Still need to add different Options!
        } else {
            ticket="Goodbye & Until next Time";
        }
            System.out.println(ticket);
        }
    }



