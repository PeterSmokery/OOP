package FamilyTree.Statics;

public class Id {
    private static Integer id = 0;

    public static synchronized Integer createID()
    {
        id++;
        return id;
    }    
}
