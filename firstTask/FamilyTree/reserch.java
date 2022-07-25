package FamilyTree;
import java.util.ArrayList;

public class reserch {
  ArrayList<Relastionships> Tree;
  int count=0;
  public reserch(FamilyTree tree) {
    Tree = tree.getTree();
  }
  
  public void fullreserch(Person p)
  {
    findParents(p);
    findchildren(p);
    findSiblings(p);
  }
  public ArrayList<String> findchildren(Person p) {
    ArrayList<String> result= new ArrayList<>();
    for (Relastionships t : Tree) {
      if (t.p1.getFullName() == p.getFullName() && ((t.re == Relationship.father)|(t.re==Relationship.mother))) {
        result.add(t.p2.getFullName());
        count++;
      }
   } 
   if(count>1)
   System.out.println(" for the "+ p.getFullName() +" as a parent result is "  + result);
   if(count==1)
   System.out.println( " for the "+ p.getFullName()+ " as a parent result is " + result);
   if(count==0)
   System.out.println("no such relationship for this person");
   return result;
}
   public ArrayList<String> findParents(Person p) {
    ArrayList<String> result= new ArrayList<>();
    for (Relastionships t : Tree) {
      if (t.p1.getFullName() == p.getFullName() && ((t.re == Relationship.son)|(t.re==Relationship.daugther))) {
        result.add(t.p2.getFullName());
        count++;
      }
   } 
   if(count>1)
   System.out.println(" for the "+ p.getFullName() +" as a child result is "  + result);
   if(count==1)
   System.out.println( " for the "+ p.getFullName()+ " as a child result is " + result);
   if(count==0)
   System.out.println("no such relationship for this person");
   return result;
   }

   public ArrayList<String> findSiblings(Person p) {
    ArrayList<String> result= new ArrayList<>();
    for (Relastionships t : Tree) {
      if (t.p1.getFullName() == p.getFullName() && ((t.re == Relationship.sister)|(t.re==Relationship.brother))) {
        result.add(t.p2.getFullName());
        count++;
      }
   } 
   if(count>1)
   System.out.println(" for the "+ p.getFullName() +" as a sibling result is "  + result);
   if(count==1)
   System.out.println( " for the "+ p.getFullName()+ " as a sibling result is " + result);
   if(count==0)
   System.out.println("no such relationship for this person");
   return result;
   }
  }

