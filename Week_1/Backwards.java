package Week_1;
public class Backwards {
    public static void main(String[] args) {
        String sentence = "pay no attention to that man behind the curtain";
        int leng = sentence.length();
        // int currChar = leng -1;
        // int newChar = 0;
        int wordLength = 0;
        String currWord ="";

        for (int i = leng-1; i >= 0; i--)
        {
            if (i==0)
            {
                currWord = sentence.substring(i, i+1+wordLength);
                wordLength = 0;
                // currChar = i+1;
                System.out.println(currWord);  
                
            }
            else if (sentence.charAt(i) != ' ')
            {
                wordLength++;
            }
            else if (sentence.charAt(i) == ' ')
            {
                currWord = sentence.substring(i+1, i+1+wordLength);
                wordLength = 0;
                // currChar = i+1;
                System.out.println(currWord);
            }
            
        }

        // while (currChar >= 0)
        // {
        // newChar = sentence.lastIndexOf(" ", currChar);
        // // System.out.println(sentence.substring(newChar, currChar + 1));

        
        // for (int i = newChar+1; i >= currChar; i++)
        // {
        //     System.out.print(sentence.charAt(i));
        // }
        // currChar = newChar-1;
        // }
    }
}
