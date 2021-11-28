import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondtNum = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNum.add(secondtNum);

        System.out.println(sum);
    }
}
