import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class HelloGoodbye {
    public static void main(String[] args) {
        String first_name = args[0];
        String second_name = args[1];
        StdOut.println("Hello " + first_name + " and " + second_name + ".");
        StdOut.println("Goodbye " + second_name + " and " + first_name + ".");
    }
}