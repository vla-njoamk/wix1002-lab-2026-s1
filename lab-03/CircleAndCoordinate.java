import java.util.Scanner;
public class CircleAndCoordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter x-coordinate: ");
        double x =sc.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y =sc.nextDouble();
        if(x*x + y*y <= radius){
            System.out.println("The point is in the circle");
        }
        else{
            System.out.println("The point is out of the circle");
        }


    }
}   
