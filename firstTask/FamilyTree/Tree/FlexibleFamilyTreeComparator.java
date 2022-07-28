package FamilyTree.Tree;

import java.util.Comparator;

import FamilyTree.Enums.Order;

public class FlexibleFamilyTreeComparator implements Comparator<Relationships> {
  
    private Order sortingBy ;
  
    @Override
    public int compare(Relationships relationships1, Relationships relationships2) {
      switch(sortingBy) {
        case FirstPersonName: return relationships1.getFirtPerson().getFullName().compareTo(relationships2.getFirtPerson().getFullName());
        case RelationshipBetween: return relationships1.getRelationships().compareTo(relationships2.getRelationships());
        case SecondPersonName: return relationships1.getSecondPerson().getFullName().compareTo(relationships2.getSecondPerson().getFullName());
        case id: return relationships1.getFirtPerson().getid().compareTo(relationships2.getFirtPerson().getid());
      }
      throw new RuntimeException("Practically unreachable code, can't be thrown");
    }
  
    public void setSortingBy(Order sortBy) {
      sortingBy = sortBy;
    }



}