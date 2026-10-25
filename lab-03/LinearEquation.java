import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax + by = e \ncx + dy = f");
        System.out.print("Enter a number for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter a number for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter a number for c: ");
        double c = sc.nextDouble();
        System.out.print("Enter a number for d: ");
        double d = sc.nextDouble();
        System.out.print("Enter a number for e: ");
        double e = sc.nextDouble();
        System.out.print("Enter a number for f: ");
        double f = sc.nextDouble();
        if(a*d - b*c == 0){
            System.out.println("The equation has no solution");
        }
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        System.out.printf("x = %.2f%n",x);
        System.out.printf("y = %.2f",y);
    }
}
