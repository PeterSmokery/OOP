package CatWithMan.Animals.pet;

import CatWithMan.Animals.animal;

public class dog_pet extends animal implements pet {

    public void waggingTail()
    {
            tail = "moving";
            condition = "sit";
    }

    @Override
    public void listen_host() {
        condition="sit";
    }
}
