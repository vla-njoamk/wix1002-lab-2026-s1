import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score;
        double total = 0;
        double total2 = 0;
        int count = 0;
        double max = 0;
        double min = 100;
        do{
            System.out.print("Enter a score [negative score to quit] : ");
            score = sc.nextDouble();
            if(score > 0){
                total += score;
                total2 += score*score;
                count++;
                if(score > max){
                    max = score;
                }
                if(score < min){
                    min = score;
                }
            }
        }while(score > 0);
        double average = total / count;
        double s = Math.sqrt((total2 - (total*total)/count)/(count - 1));
        System.out.printf("Minimum score: %.2f%n",min);
        System.out.printf("Maximum score: %.2f%n",max);
        System.out.printf("Average score: %.2f%n",average);
        System.out.printf("Standard deviation: %.2f%n",s);
        sc.close();
    }
}
