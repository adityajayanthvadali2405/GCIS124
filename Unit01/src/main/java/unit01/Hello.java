package unit01;

import java.util.Scanner;

public class Hello {
    public static void helloYou () {
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter your name: ");
        String name = in.nextLine ();
        in.close ();

        System.out.println ("Hello, " + name + "!");
    }

    public static void main (String[] args) {
        helloYou ();
    }
}
