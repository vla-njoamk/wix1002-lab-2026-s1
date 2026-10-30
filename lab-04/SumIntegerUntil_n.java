import java.util.Scanner;
public class SumIntegerUntil_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 0;
        int total = 0;
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            current += i;
            total += current; 
        }
        System.out.println(total);
        sc.close();
    }
}
