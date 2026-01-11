package JFrame;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapAbout
{
    public static void main(String[] args)
    {
        Map<Integer, String> linkHash = new LinkedHashMap<>(3,1f, true){

            protected static final int MAX_SIZE = 3;


            // Dou Override na função que define quando o item mais inutilizado do LinkedHashMap deverá ser removido
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > MAX_SIZE;
            }
        };

        linkHash.put(1, "A");
        linkHash.put(2, "B");
        linkHash.put(3, "C");

        linkHash.get(1);
        // Ordem: B, C, A

        linkHash.put(4, "D");
        // Ordem: C, A, D

        System.out.println(linkHash);

    }
}
