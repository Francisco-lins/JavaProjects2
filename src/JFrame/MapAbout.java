package JFrame;

import java.util.HashMap;
import java.util.Map;

public class MapAbout
{
    public static void main(String[] args)
    {
        Map<String, Integer> MAP = new HashMap<>(){{
            put("João", 17);
            put("Francisco", 14);
            put("Maria Clara", 11);
            put("Maria Eduarda", 19);
        }};

        for(Map.Entry<String, Integer> entry : MAP.entrySet())
        {
            System.out.printf("%s -> %d Anos\n", entry.getKey(), entry.getValue());
        }



    }
}
