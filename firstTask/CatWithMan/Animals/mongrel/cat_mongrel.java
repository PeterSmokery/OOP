package CatWithMan.Animals.mongrel;

import CatWithMan.Animals.animal;

public class cat_mongrel extends animal implements mongrel {
    public void purr()
    {
        System.out.println("purr");
        condition = "relaxed";
    }

    @Override
    public void movescareful() {
        System.out.println("shhhh");
        condition="danger";
        
    }
}
