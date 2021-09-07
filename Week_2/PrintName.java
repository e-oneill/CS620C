package Week_2;
public class PrintName
{
    public static void main(String[] args) {
        
        if (args.length >= 2)
        {
        String fname = args[0];
        String sname = args[1];
        System.out.println(fname);
        System.out.println(sname);
        }
        else
        {
            System.out.println("Invalid arguments provided.");
        }



    }
}