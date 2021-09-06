public class ReverseStringInput
{
    public static void main(String[] args) {
        String str = "The old man in nantucket   ";
        if (args.length >= 1)
        {
        str = "";
            for (int x = 0; x < args.length; x++)
            {
                if (x > 0)
                {
                str += " " + args[x];
                }
                else
                {
                    str += args[x];
                }
            }
        }

        // System.out.println(str);


        int lastWordStart = str.lastIndexOf(' ');
        int y = str.length() - 1;
        while (str.charAt(lastWordStart) == ' ')
        {
                lastWordStart--;
                // System.out.println("Index is " + lastWordStart + " Character is " + str.charAt(lastWordStart));
                y--;
        }
        int firstWordEnd = str.indexOf(' ');
        int i = lastWordStart;
        
        String currWord = "";

        // While loop that iterates from the last instance of space until it hits the end of the first word in the string. 
        while (i >= firstWordEnd)
        {
            if (str.charAt(i+1) != ' ')
            {
            // Check if the next character is not also space. If it is a space, we skip until we find a letter
            currWord = str.substring(i+1,y+1);
            System.out.println(currWord);
            }
            y = i;
            i = str.lastIndexOf(' ', i-1);
        }
        // While loop exits before first word, so printing first word now.
        System.out.println(str.substring(0, firstWordEnd));

        
    }
}