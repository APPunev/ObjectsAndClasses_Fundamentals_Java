import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        BigInteger fact = new BigInteger("1");
        for (int i = num; i >= 1 ; i--) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        System.out.println(fact);
    }
}
