import java.util.Arrays;
import java.util.Stack;

/**
 * Created by blayhem on 24/06/15.
 */
public class Test {
    public static void main(String[] args) {
        String song = "RWUBWUBWUBLWUB";

        char[] original = song.toCharArray();
        String decoded = "";
        for (int i = 0; i < original.length; i++) {
            if(original[i] == 'W' && original[i+1] == 'U' && original[i+2] == 'B'){
                decoded += ' ';
                i += 2;
            }
            else decoded += original[i];
        }
        //removing unnecessary spaces
        while(decoded.contains("  ")){decoded = decoded.replace("  "," ");}
        if(decoded.charAt(0) == ' '){decoded = decoded.substring(1);}
        if(decoded.charAt(decoded.length()-1) == ' '){decoded = decoded.substring(0, decoded.length()-1);}
        System.out.println(decoded);
    }
}