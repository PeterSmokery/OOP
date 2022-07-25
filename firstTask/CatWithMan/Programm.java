package CatWithMan;

import java.util.Random;

import CatWithMan.Animals.mongrel.cat_mongrel;
import CatWithMan.Animals.mongrel.dog_mongrel;
import CatWithMan.Animals.pet.cat_pet;
import CatWithMan.people.not_owner.man_not_owner;
import CatWithMan.people.owner.owner;
import CatWithMan.people.owner.women_owner;


public class Programm {
    public static void main(String[] args) {
        man_not_owner georgy = new man_not_owner();
        women_owner dmitry = new women_owner();
        cat_pet sharik = new cat_pet();
        dog_mongrel birka = new dog_mongrel();
        birka.make_sounds();
        sharik.food_asking();
        georgy.touch();
        dmitry.rule();

    }
}
