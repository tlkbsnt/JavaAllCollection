package bsnt.np.string;

import java.util.StringTokenizer;
public class StringTokenizers {

    public void stringTokenizers(){
        String stringTokenizer = "This is Tokenizer class message";
        StringTokenizer s = new StringTokenizer(stringTokenizer);
        System.out.println("Total Tokens are: " +s.countTokens());
        int i = 1;
        while (s.hasMoreElements()){
            System.out.println("Token" + ":" + i +" "+ s.nextElement());
            i++;
        }
    }
}
