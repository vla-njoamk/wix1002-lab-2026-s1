import java.util.Scanner;
public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the sales volume: ");
        double volume = sc.nextDouble();
        double commission = 0;
        if(volume < 0){
            System.out.println("Invalid input");
        }
        else if(volume <= 100){
            commission = volume*0.05;
        }
        else if(volume > 100 && volume <= 500){
            commission = volume*0.075;
        }
        else if(volume > 500 && volume <= 1000){
            commission = volume*0.1;
        }
        else{
            commission = volume*0.125;
        }
        System.out.printf("Commission %.2f",commission);
    }
}
