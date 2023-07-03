package com.sgtesting.mreturn;
class Subtraction 
{
    int[][] subtractArrays(int[][] x, int[][] y) 
    {
        if (x.length == y.length && x[0].length == y[0].length) 
        {
            int[][] z = new int[x.length][x[0].length];
            for (int i = 0; i < x.length; i++) 
            {
                for (int j = 0; j < x[i].length; j++) 
                {
                    z[i][j] = x[i][j] - y[i][j];
                }
            }
            return z;
        } 
        else {
            System.out.println("Arrays have different dimensions.");
            return null;
        }
    }
}

public class Rdemo6 {
    public static void main(String[] args) {
        int[][] x = {{10, 20, 30}, {40, 50, 60}};
        int[][] y = {{1, 2, 3}, {4, 5, 6}};

        Subtraction o1 = new Subtraction();
        int[][] result = o1.subtractArrays(x, y);

       if (result != null) {
            System.out.println("Result:");
            for (int i = 0; i < result.length; i++) 
            {
                for (int j = 0; j < result[i].length; j++)
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
    



