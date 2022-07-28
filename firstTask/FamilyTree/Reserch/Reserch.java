package FamilyTree.Reserch;
import java.util.ArrayList;

import FamilyTree.Enums.Relationship;
import FamilyTree.Persons.Person;
import FamilyTree.Tree.FamilyTree;
import FamilyTree.Tree.Relationships;


public class Reserch {
  
  private ArrayList<Relationships> Tree;
  private int count=0;

  public Reserch (FamilyTree tree) {
    Tree = tree.getTree();
  }
  
  public void fullreserch(Person p) {
    findParents(p);
    findChildren(p);
    findSiblings(p);
  }

  public ArrayList<String> findChildren(Person p) {
    ArrayList<String> result= new ArrayList<>();
    for (Relationships t : Tree) {
      if (t.getFirtPerson().getFullName() == p.getFullName() & ((t.getRelationships() == Relationship.father)|(t.getRelationships()==Relationship.mother))) {
        result.add(t.getSecondPerson().getFullName());
        count++;
      }
    } 
    if(count>1)
    System.out.println(" for the "+ p.getFullName() +" with id: "+p.getid() + " as a parent result is "  + result);
    if(count==1)
    System.out.println( " for the "+ p.getFullName()+" with id: "+p.getid() + " as a parent result is " + result);
    if(count==0)
    System.out.println("no such relationship for this person");
    return result;
  }

   public ArrayList<String> findParents(Person p) {
    ArrayList<String> result= new ArrayList<>();
    for (Relationships t : Tree) {
      if (t.getFirtPerson().getFullName() == p.getFullName() & ((t.getRelationships() == Relationship.son)|(t.getRelationships()==Relationship.daugther))) {
        result.add(t.getSecondPerson().getFullName());
        count++;
      }
    } 
    if(count>1)
    System.out.println(" for the "+ p.getFullName() +" with id: "+p.getid() +" as a child result is "  + result);
    if(count==1)
    System.out.println( " for the "+ p.getFullName()+" with id: "+p.getid() + " as a child result is " + result);
    if(count==0)
    System.out.println("no such relationship for this person");
    return result;
   }

   public ArrayList<String> findSiblings(Person p) {
    ArrayList<String> result= new ArrayList<>();
    for (Relationships t : Tree) {
      if (t.getFirtPerson().getFullName() == p.getFullName() & ((t.getRelationships() == Relationship.sister)|(t.getRelationships()==Relationship.brother))) {
        result.add(t.getSecondPerson().getFullName());
        count++;
      }
    } 
    if(count>1)
    System.out.println(" for the "+ p.getFullName() +" id: "+p.getid() +" as a sibling result is "  + result);
    if(count==1)
    System.out.println( " for the "+ p.getFullName()+" id: "+p.getid() + " as a sibling result is " + result);
    if(count==0)
    System.out.println("no such relationship for this person");
    return result;
   }
}