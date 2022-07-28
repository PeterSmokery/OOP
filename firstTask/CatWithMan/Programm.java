package CatWithMan;

import CatWithMan.Animals.mongrel.cat_mongrel;
import CatWithMan.Animals.mongrel.dog_mongrel;
import CatWithMan.Animals.pet.cat_pet;



public class Programm {
    public static void main(String[] args) {

        cat_pet sharik = new cat_pet();
        dog_mongrel birka = new dog_mongrel();
        birka.make_sounds();
        sharik.food_asking();

    }
}
