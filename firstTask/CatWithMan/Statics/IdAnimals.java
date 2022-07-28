package CatWithMan.Statics;

public class IdAnimals {
    private static long id = 0;

    public static synchronized Long createID()
    {
        id++;
        return id;
    }  
}