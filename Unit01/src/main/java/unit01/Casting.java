package unit01;

public class Casting {
    public static void main(String[] args) {

        int i = 12345;
        long l = i;
        System.out.println (i + " " + l);

        l = 4294967297l;
        i = (int)l;
        System.out.println (l + " " + i);

        char c = 'H';
        i = c;
        System.out.println (c + " " + i);

        i = 96;
        c = (char)i;
        System.out.println (i + " " + c);

        // boolean b = false;
        // i = (int)b;
    }
}
