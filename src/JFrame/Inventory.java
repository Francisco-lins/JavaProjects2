package JFrame;

import java.util.List;
import java.util.ArrayList;

public class Inventory<T extends Item>
{
    private final int  MAX_STORAGE = 36;
    private List<T> INVENTORY = new ArrayList<>();

    void clearInventory()
    {
        INVENTORY.clear();
    }

    void add(T item)
    {
        if (INVENTORY.size() >= MAX_STORAGE)
        {
            INVENTORY.add(item);
        }
    }

    T get(int id)
    {
        return INVENTORY.get(id);
    }

    void dropItem(int id)
    {
        INVENTORY.remove(id);
    }

    boolean contains(T item)
    {
        return INVENTORY.contains(item);
    }





}
