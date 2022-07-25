package CatWithMan.Animals.mongrel;

import CatWithMan.Animals.animal;

public class dog_mongrel extends animal implements mongrel{
    public void waggingTail()
    {
        tail = "moving";
        condition = "sit";
    }

    @Override
    public void movescareful() {
        System.out.println("rrar");
        condition = "danger";
        tail ="stopped";
        
    }
}
