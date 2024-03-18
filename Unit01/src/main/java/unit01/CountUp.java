package unit01;

public class CountUp {
    
    public static int countWhile (int n) {
        int count = 0;
        int sum = 0;
        while (count < n) {
            System.out.println (count);
            sum += count;
            count++;
        }
        return sum;
    }

    public static int countFor (int n) {
        int sum = 0;
        for (int count = 0; count < n; count++) {
            System.out.println (count);
            sum += count;
        }
        return sum;
    }

    public static void main (String[] args) {
        System.out.println ("Sum = " + countWhile (5));
        System.out.println ("Sum = " + countFor (6));
    }
}
