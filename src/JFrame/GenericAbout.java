package JFrame;

class Box<T>
{
    private T value;

    void set(T value)
    {
        this.value = value;
    }

    T get()
    {
        return this.value;
    }

    public static <T> T echo(T value)
    {
        return value;
    }
}



public class GenericAbout<T>
{


}
