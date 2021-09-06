package Week_1;
public class Backwards {
    public static void main(String[] args) {
        String sentence = "pay no attention to the man";
        int leng = sentence.length();
        int currChar = leng -1;
        int newChar = 0;
        while (currChar >= 0)
        {
        newChar = sentence.lastIndexOf(" ", currChar);
        // System.out.println(sentence.substring(newChar, currChar + 1));

        
        for (int i = newChar+1; i >= currChar; i++)
        {
            System.out.print(sentence.charAt(i));
        }
        currChar = newChar-1;


        }
    }
}
