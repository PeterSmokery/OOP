package CatWithMan.Statics;

public class IdPeople {
    private static long id = 0;

    public static synchronized Long createID()
    {
        id++;
        return id;
    }  
}
