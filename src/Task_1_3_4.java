
import java.math.BigInteger;
public class Task_1_3_4 {


    public static void main(String[] args) {

        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            long y = i*i;
            res = res.multiply(BigInteger.valueOf(y));
            System.out.println(res);
        }
    }
}
