package FamilyTree;

import FamilyTree.Enums.Order;
import FamilyTree.Enums.Sex;
import FamilyTree.Persons.Person;
import FamilyTree.Reserch.Reserch;
import FamilyTree.Tree.FamilyTree;

public class Program {

  public static void main(String[] args) {
 Person p1 = new Person("Valera", Sex.man);
 Person p2 = new Person("Irina",Sex.women);
 Person p3 = new Person(Sex.man);
 Person p4 = new Person("Masha",Sex.women);
 Person p5 = new Person("Jenya",Sex.women);
 Person p6 = new Person("Vanya",Sex.man);
 Person p7 = new Person("gosha",Sex.man);
 Person p8 = new Person("gosha",Sex.man);
 
 System.out.println( p1.toString());
 System.out.println("------");
 System.out.println(p3.toString());

 FamilyTree Kastro = new FamilyTree();
 Kastro.append(p1, p3);
 Kastro.append(p2, p3);
 Kastro.append(p1, p4);
 Kastro.append(p2, p4);
 Kastro.append(p4, p5);
 Kastro.append(p4, p6);
 Kastro.append(p4, p7);
 Kastro.append(p5, p8);
 
 System.out.println("------");
 System.out.println( p1.toString());
 System.out.println("------");
 

 Kastro.sortFamilyTreeBy(Order.RelationshipBetween);
 Kastro.showtree();
 
 System.out.println("------");
 new Reserch(Kastro).findChildren(p1);
 System.out.println("------");
 new Reserch(Kastro).findParents(p4);
 System.out.println("------");
 new Reserch(Kastro).findSiblings(p4);
 System.out.println("------");
 new Reserch(Kastro).fullreserch(p5);
 }
 
}
  
 




