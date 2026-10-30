import java.util.Scanner;
public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the  first  day  of  the  year(0-6): ");
        int firstDay = sc.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31};
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }
        int mayFirstDay = firstDay;
        for (int i = 0; i < 4; i++) {
            mayFirstDay = (mayFirstDay + days[i]) % 7;
        }
        int augFirstDay = firstDay;
        for (int i = 0; i < 7; i++) {
            augFirstDay = (augFirstDay + days[i]) % 7;
        }
        displayCalender("May",days[5],mayFirstDay);
        displayCalender("August",days[5],augFirstDay);
         sc.close();
    }
    public static void displayCalender(String month , int totalDay , int firstDay){
        System.out.println(month);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for(int i = 0; i < firstDay; i++){
            System.out.print("    ");
        }
        for(int i = 1; i <= totalDay; i++){
            System.out.printf("%4d",i);
            if((i+firstDay)%7 == 0){
                System.out.println();
            }
        }
    }
}

