import java.util.Random;
import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Random random = new Random ();
        Scanner sc = new Scanner(System.in);
        int result1 = 0 , result2 = 0, result3 = 0, result4 = 0, total1 = 0, total2 = 0;
        System.out.println("Press enter to roll the first dice for Player 1");
        String dice1 = sc.nextLine();
        if (!dice1.equals(null)){
            result1 = random.nextInt(1,7);
            System.out.println("Player 1 score: "+ result1);
        }
        System.out.println("Press enter to roll the second dice for Player 1");
        String dice2 = sc.nextLine();
        if (!dice2.equals(null)){
            result2 = random.nextInt(1,7);
            total1 = result1 + result2 ;
            System.out.println("Player 1 score: "+ result2);
            System.out.println("Player 1 total score: "+ total1);
        }
        System.out.println("Press enter to roll the first dice for Player 2");
        String dice3 = sc.nextLine();
        if (!dice3.equals(null)){
            result3 = random.nextInt(1,7);
            System.out.println("Player 1 score: "+ result3);
        }
        System.out.println("Press enter to roll the second dice for Player 2");
        String dice4 = sc.nextLine();
        if (!dice4.equals(null)){
            result2 = random.nextInt(1,7);
            total2 = result3 + result4 ;
            System.out.println("Player 1 score: "+ result4);
            System.out.println("Player 1 total score: "+ total2);
        }
        if(total1 == total2){
            System.out.println("Tie");
        }
        else if(total1 > total2){
            System.out.println("Player 1 win");
        }
        else{
             System.out.println("Player 2 win");
        }
        
       

    }
}
