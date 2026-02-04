package JFrame;

import java.util.List;
import java.util.ArrayList;




class Printer
{
        static void printList(List<?> list)
        {
            list.forEach(i -> System.out.print(i+" "));
            System.out.println();
        }
}


public class teste3
{
    public static void main(String[] args)
    {
        List<?> list = List.of(2,3,4,"String",'a',3.14);

        Printer.printList(list);
    }
}
