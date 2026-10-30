import java.util.Scanner;
import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int result1 = 0, result2 = 0, total1 = 0 , total2 = 0;
        while (total1 < 100 && total2 < 100){ 
            do{
                System.out.println("Press enter to roll the dice for Player 1");
                String dice1 = sc.nextLine();
                if (!dice1.equals(null)){
                    result1 = random.nextInt(1,7);
                    System.out.println("Player 1 score: "+ result1);
                    total1 += result1;
                    System.out.println("Player 1 current score: " + total1 + "\n");
                }
            }while(result1 == 6);
            do{
                System.out.println("Press enter to roll the dice for Player 2");
                String dice2 = sc.nextLine();
                if (!dice2.equals(null)){
                    result2 = random.nextInt(1,7);
                    System.out.println("Player 2 score: "+ result2);
                    total2 += result2;
                    System.out.println("Player 2 current score: " + total2 + "\n");
                }
            }while(result2 == 6);
        }
        if(total1 > total2){
            System.out.println("Player 1 win");
        }
        else if(total1==total2){
            System.out.println("Tie");
        }
        else{
            System.out.println("Player 2 win");
        }
        sc.close();
    }
}
