import java.util.Random;
public class RandomNumberDigit {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt() & Integer.MAX_VALUE;
        int i = 0;
        System.out.println(num);
        do{
            num /= 10;
            i++;
        }while (num > 0);
        int digit = i ;
        System.out.println(digit);
    }
}
