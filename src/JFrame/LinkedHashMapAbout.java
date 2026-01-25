package JFrame;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapAbout
{
    public static void main(String[] args)
    {
        Map<Integer, String> linkHash = new LinkedHashMap<>(16,0.75f, true);

        linkHash.put(1, "A");
        linkHash.put(2, "B");
        linkHash.put(3, "C");

        // Ordem: A, B, C

        linkHash.get(1);
        // Ordem: B, C, A

        linkHash.put(4, "D");
        // Ordem: C, A, D

        System.out.println(linkHash);
    }
}
