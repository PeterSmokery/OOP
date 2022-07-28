package CatWithMan.people;

import java.util.ArrayList;

import CatWithMan.Animals.pet.pet;
import CatWithMan.Statics.IdPeople;
import FamilyTree.Enums.Sex;

class Person {

    private String Name;
    private Sex sex ;
    private ArrayList<Person> pets = new ArrayList<>();
    private Long id ;
  
    public Person(String fullName,Sex sex) {
      this.Name = fullName;
      this.sex = sex;
      id = IdPeople.createID();
    }
  
    public Person(Sex sex) {
      this( "unknown",sex);
    }
  
    public String getFullName() {
      return Name;
    }
  
    public Sex getSex() {
      return sex;
    }
  
    public long getid() {
      return id;
    }
  
    public void ChildAdd(Person child) {
        pets.add(child);
    }
    
    @Override
    public String toString() {
      String result ;
      String SonsAndDaugthers ="" ;
        for(Person child : children){
         SonsAndDaugthers= SonsAndDaugthers + child.Name + "; ";
        }
        result = ("id:"+id+" name: " +Name +", sex: " +sex+ ", his children: "+ SonsAndDaugthers);
      
      return String.format(result);
    }
  
  }