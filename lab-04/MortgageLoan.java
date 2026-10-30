import java.util.Scanner;
public class MortgageLoan {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double totalL = 0;
         System.out.print("Enter principle amount: ");
         double P = sc.nextDouble();
         System.out.print("Enter interest in %: ");
         double i = sc.nextDouble();
         System.out.print("Enter total number of month(s): ");
         int N = sc.nextInt();

         double M =(P*(i/(12*100)))/(1-Math.pow(1+i/(12*100),-N));
         
         System.out.println("Month\tMonthly Payment\t\tPrinciple\tInterest\tUnpaid Balnce\tTotal interest");
         for(int n = 1; n <= N; n++){
            double C = M* Math.pow((1+i/(12*100)),-(1+N-n));
            double L = M - C;
            double R = L/(i/(12*100)) - C;
            totalL += L;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%n", n, M, C, L, R, totalL

            );
         }
         sc.close();
    }
}
