import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        int count = 0;
        System.out.print("Enter an Integer(0-100): ");
        int n = sc.nextInt();
        if(n > 100 || n < 0){
            System.out.println("Invalid Number");
            sc.close();
            return;           
        }
        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }

            num++;
            sc.close();
        }
    }
}
