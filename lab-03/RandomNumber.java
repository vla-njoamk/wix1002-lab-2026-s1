import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        switch (num) {
            case 0 -> System.out.println(num + " is zero");
            case 1 -> System.out.println(num + " is one");
            case 2 -> System.out.println(num + " is two");
            case 3 -> System.out.println(num + " is three");
            case 4 -> System.out.println(num + " is four");
            case 5 -> System.out.println(num + " is five");
        }
    }
}
