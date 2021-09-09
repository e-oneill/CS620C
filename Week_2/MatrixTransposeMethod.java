package Week_2;

public class MatrixTransposeMethod {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] arr = new int[rows][columns];
        int num = 1;
        for (int i=0; i < rows; i++)
        {
            for (int j=0; j < columns; j++)
            {
                arr[i][j] = num++; 
            }
        }

        for (int i=0; i < rows; i++)
        {
            System.out.print("[ ");
            for (int j=0; j < columns; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
        int[][] transpArr = transposeArray(arr);
        System.out.println("Transposing array...");
        System.out.println();

        for (int i=0; i < rows; i++)
        {
            System.out.print("[ ");
            for (int j=0; j < columns; j++)
            {
                System.out.print(transpArr[i][j] + " ");
            }
            System.out.println("]");
        }


    }

    public static int[][] transposeArray (int[][] arr)
    {
        int rows = arr[0].length;
        int columns = arr.length;
        // int orgRows = arr.length;
        // int orgColumns = arr[0].length;
        // int x = 0;
        int[][] arr2 = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j=0; j < columns; j++)
            {
               arr2[i][j] = arr[j][i];
            }
        }

        return arr2;
    }
}
