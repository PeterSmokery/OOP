package CatWithMan.people.owner;


import CatWithMan.people.human;

public class man_owner extends human implements owner {

    public void runWitnAnimal()
    {
        System.out.println("i will catch you!");
    }

    @Override
    public void rule() {
        System.out.println("sit!");
        
    }
}
