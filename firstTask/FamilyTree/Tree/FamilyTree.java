package FamilyTree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import FamilyTree.Enums.Order;
import FamilyTree.Enums.Relationship;
import FamilyTree.Persons.Person;

public class FamilyTree {

  private ArrayList<Relationships> tree = new ArrayList<>();
  private ArrayList<Relationships> treeOfSiblings = new ArrayList<>();

  public ArrayList<Relationships> getTree() {
    return tree;
  }
 
  public void append(Person parent, Person child) {
    tree.add(new Relationships(parent, Relationship.parent, child));
    tree.add(new Relationships(child, Relationship.child, parent));
    for(Relationships t:tree)
    {
      if((t.getFirtPerson()==parent)&(t.getSecondPerson() != child)&((t.getRelationships()==Relationship.father)|(t.getRelationships()==Relationship.mother)))
      {
      treeOfSiblings.add(new Relationships(child, Relationship.siblings, t.getSecondPerson()));
      treeOfSiblings.add(new Relationships(t.getSecondPerson(), Relationship.siblings,child ));
      }
      if(((t.getRelationships()==Relationship.sister|t.getRelationships()==Relationship.brother)) &(t.getSecondPerson()==child))
      treeOfSiblings.clear();
    }
    tree.addAll(treeOfSiblings);
    treeOfSiblings.clear();
  }

  public void showtree() {
    System.out.println("--------");
    for(Relationships t : tree)
    {
      System.out.println(t.toString());
    }
    System.out.println("--------");
  }

  public void sortFamilyTreeBy(Order sortingBy) {
    List<Relationships> relationships = this.tree;
    FlexibleFamilyTreeComparator comparator = new FlexibleFamilyTreeComparator();
    comparator.setSortingBy(sortingBy);
    Collections.sort(relationships, comparator); 
  }

}

