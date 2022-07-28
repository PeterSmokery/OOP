package FamilyTree.Tree;

import FamilyTree.Enums.Relationship;
import FamilyTree.Enums.Sex;
import FamilyTree.Persons.Person;

public class Relationships {
    private Person FirstPerson;
    private Relationship RelationshipBetween;
    private Person SecondPerson;

    public Person getFirtPerson(){
        return FirstPerson;
    }

    public Person getSecondPerson(){
        return SecondPerson;
    }

    public Relationship getRelationships(){
        return RelationshipBetween;
    }

    public Relationships(Person FirstPerson, Relationship RelationshipBetween, Person SecondPerson) {
        if(FirstPerson == SecondPerson) {
            System.out.println("записывается одна и та же личность");
            System.exit(1);
        }
        else {
         if((RelationshipBetween == Relationship.parent)&(FirstPerson.getSex()==Sex.man)) {
         FirstPerson.ChildAdd(SecondPerson);
         this.FirstPerson = FirstPerson;
         this.RelationshipBetween = Relationship.father;
         this.SecondPerson = SecondPerson;
         }

         if((RelationshipBetween==Relationship.parent)&(FirstPerson.getSex()==Sex.women) ) {
         FirstPerson.ChildAdd(SecondPerson);
         this.FirstPerson = FirstPerson;
         this.RelationshipBetween = Relationship.mother;
         this.SecondPerson = SecondPerson;
         }
         if((RelationshipBetween==Relationship.child)&(FirstPerson.getSex()==Sex.women)) {
         this.FirstPerson = FirstPerson;
         this.RelationshipBetween = Relationship.daugther;
         this.SecondPerson = SecondPerson;
         }
         if((RelationshipBetween==Relationship.child)&(FirstPerson.getSex()==Sex.man)) {
         this.FirstPerson = FirstPerson;
         this.RelationshipBetween = Relationship.son;
         this.SecondPerson = SecondPerson;
         }
         if((RelationshipBetween == Relationship.siblings)&(FirstPerson.getSex()==Sex.man)) {
          this.FirstPerson = FirstPerson;
          this.RelationshipBetween = Relationship.brother;
          this.SecondPerson = SecondPerson;
         }
         if((RelationshipBetween == Relationship.siblings)&(FirstPerson.getSex()==Sex.women)) {
          this.FirstPerson = FirstPerson;
          this.RelationshipBetween = Relationship.sister;
          this.SecondPerson = SecondPerson;
         }
        }
    }
   
    @Override
    public String toString() {
        return String.format("<%s id %s is %s to %s id %s>", FirstPerson.getFullName(),FirstPerson.getid(), RelationshipBetween, SecondPerson.getFullName(),SecondPerson.getid());
    }
}