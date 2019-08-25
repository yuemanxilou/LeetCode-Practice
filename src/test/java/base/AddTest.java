package base;

import org.junit.Test;

import java.lang.annotation.Target;

public class AddTest {


    @Test
    public void addTest() {
        int a = 9;
        int b = 3;
        int c = a ^ b;
        int d = (a & b) << 1;
        System.out.println(c);
        System.out.println(d);

        System.out.println(Add(a, b));
    }

    public static int Add(int a, int b) {
        return b == 0 ? a : Add(a ^ b, (a & b) << 1);
    }
}
