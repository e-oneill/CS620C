package Week_2.Exam;

public class Junkwork {
    public static void main(String[] args)
    {
        int [] array={1,2,3,4,5};
        method(array);
        System.out.print(array[1]);
    }

    public static void method(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]*=2;
        }
    }
}
