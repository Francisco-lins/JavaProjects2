package JFrame;

import java.util.Set;
import java.util.HashSet;

public class HashSetAbout
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        for (int num : set){
            System.out.printf("%d -> %d\n", num, num*2);
        }
    }
}
