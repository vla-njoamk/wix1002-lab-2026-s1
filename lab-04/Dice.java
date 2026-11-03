import java.util.Scanner;
import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int result = 0, total1 = 0 , total2 = 0;
        while (total1 < 100 && total2 < 100){ 
            do{
                System.out.print("Press enter to roll the dice for Player 1");
                sc.nextLine();
                result = random.nextInt(1,7);
                System.out.println("Player 1 score: "+ result);
                total1 += result;
                System.out.println("Player 1 current score: " + total1 + "\n");
            }while(result == 6 && total1 < 100);
            do{
                System.out.print("Press enter to roll the dice for Player 2");
                sc.nextLine();
                result = random.nextInt(1,7);
                System.out.println("Player 2 score: "+ result);
                total2 += result;
                System.out.println("Player 2 current score: " + total2 + "\n");   
            }while(result == 6 && total2 < 100);
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
