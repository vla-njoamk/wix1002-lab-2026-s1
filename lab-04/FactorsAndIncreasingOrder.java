import java.util.Scanner;
public class FactorsAndIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i+", "); 
            }  
        }
        sc.close();
    }
}
