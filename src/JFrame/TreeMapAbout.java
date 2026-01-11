package JFrame;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapAbout
{
    public static void main(String[] args)
    {
        Map<Integer, String> treeMap = new TreeMap<>();


        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(3, "C");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()){
            System.out.printf("%d -> %s\n", entry.getKey(), entry.getValue());
        }
    }
}
