package CatWithMan.people.owner;


import CatWithMan.people.human;

public class women_owner extends human implements owner{
    public void lookingAt()
    {
        System.out.println("what a pretty one !");;
    }

    @Override
    public void rule() {
        System.out.println("bring me something!");
    }
    
}
