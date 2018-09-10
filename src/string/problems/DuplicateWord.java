package string.problems;
import java.util.*;
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] word=st.split(" ");
        String rts=" ";
        for(int i=0;i<word.length;i++){
            for(int j=1+i;j<word.length;j++){
                if(word[i].length()>=word[j].length()){
                    rts=word[i];
                }
            }
        }
        System.out.println(rts);
        System.out.println(rts.length());
    }
    }

