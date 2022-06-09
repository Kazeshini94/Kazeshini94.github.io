import java.util.ArrayList;
import java.util.Random;

public class BingoCard {
    public static void main(String[] args) {

        Random rng = new Random();
        int x;

        ArrayList<Integer> list =new ArrayList<Integer>();
        String[] name = { "B","I","N","G","O"};
        int[][] number = new int[5][5];

        for(int i=0; i<5; i++) {                                                                     //Output of BINGO
            System.out.printf("%3s",name[i]);
        }
        System.out.println("\n");

        for(int card=0; card<5; card++) {                                           // Here starts the Card-Generator!
            for (int b=0; b<1; b++) {                                                         // First vertical Line !
                x = rng.nextInt(15);
                list.add(x);
                while ( list.contains(rng.nextInt(15)) ) {                    // Bad Solution for same number problem!
                    x = rng.nextInt(15);                                             // still occurs, just not as much
                }
                number[card][b]=x;
                System.out.printf("%3d",number[card][b]);
            }for (int i=1; i<2; i++) {                                                        // 2.nd vertical Line !
                x = rng.nextInt(16,30);
                list.add(x);
                while (list.contains(rng.nextInt(16,30))) {
                    x = rng.nextInt(16,30);
                }
                number[card][i] = x;
                System.out.printf("%3d", number[card][i]);
            }
            for (int n=2; n<3; n++) {                                                         // 3.rd vertical Line !
                x = rng.nextInt(31,45);
                list.add(x);
                while (list.contains(rng.nextInt(31,45))) {
                    x = rng.nextInt(31,45);
                }
                number[card][n] = x;
                if (number[card][n]==number[2][2]) {                                         // Free Field in the mid!
                    System.out.printf("%3s"," ");
                } else {
                    System.out.printf("%3d", number[card][n]);
                }
            }
            for (int g=3; g<4; g++) {                                                          // 4.th vertical Line !
                x = rng.nextInt(46,60);
                list.add(x);
                while (list.contains(rng.nextInt(46,60))) {
                    x = rng.nextInt(46,60);
                }
                number[card][g] = x;
                System.out.printf("%3d", number[card][g]);
            }
            for (int o=4; o<5; o++) {                                                         // Last vertical Line !
                x = rng.nextInt(61,75);
                list.add(x);
                while (list.contains(rng.nextInt(61,75))) {
                    x = rng.nextInt(61,75);
                    list.add(x);
                }
                number[card][o] = x;
                System.out.printf("%3d", number[card][o]);
            }
            System.out.println();
        }
    }
}
