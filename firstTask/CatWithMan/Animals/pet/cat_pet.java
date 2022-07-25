package CatWithMan.Animals.pet;

import CatWithMan.Animals.animal;

public class cat_pet extends animal implements pet   {
    public void food_asking()
    {
        System.out.println("purr");
        condition="asking";
    }

    @Override
    public void listen_host() {
        condition = "lying and looking at face";
    }
    
}
