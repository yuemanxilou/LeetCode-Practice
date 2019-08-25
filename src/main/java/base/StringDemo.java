package base;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";

        String s3 = new String("cat");
        String s4 = new String("cat");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        Integer a = new Integer(3);
        Integer.valueOf(a);
    }
}
