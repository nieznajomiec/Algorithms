import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double champion_result = 0;
        String champion_word = "";
	
	for (int i = 1; !StdIn.isEmpty(); i++) {        
	    String current_word = StdIn.readString();
 
            if(StdRandom.bernoulli(1.0 / i)) {
                champion_word = current_word;
            }
        }

        StdOut.println(champion_word);
    }
}
