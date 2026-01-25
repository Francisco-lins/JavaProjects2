package JFrame;

import java.util.function.IntBinaryOperator;

public class LambdaAbout
{
    public static void main(String[] args)
    {
        int x = 3;
        int y = 6;

        IntBinaryOperator sum = (x1,  y1) -> x1 + y1;
        int num = sum.applyAsInt(x, y);
        System.out.println(sum);
    }




}
