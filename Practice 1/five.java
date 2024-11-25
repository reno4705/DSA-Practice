import java.math.BigInteger;
import java.util.*;

public class five {
    public static void main(String[] args) {
        int n = 300;
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i < n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
