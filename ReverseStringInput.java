public class ReverseStringInput
{
    public static void main(String[] args) {
        String str = "The old man in nantucket";
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

        System.out.println(str);


        int lastWordStart = str.lastIndexOf(' ');
        int firstWordEnd = str.indexOf(' ');
        int i = lastWordStart;
        int y = str.length() - 1;
        String currWord = "";

        while (i >= firstWordEnd)
        {
            currWord = str.substring(i+1,y+1);
            System.out.println(currWord);
            y = i;
            i = str.lastIndexOf(' ', i-1);
        }

        System.out.println(str.substring(0, firstWordEnd));

        
    }
}