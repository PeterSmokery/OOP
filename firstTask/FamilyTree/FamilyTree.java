package FamilyTree;
import java.util.ArrayList;
public class FamilyTree {

  private ArrayList<Relastionships> tree = new ArrayList<>();
  private ArrayList<Relastionships> treeofsiblings = new ArrayList<>();
  int count=0;
  public ArrayList<Relastionships> getTree() {
    return tree;
  }
 
  public void append(Person parent, Person children) {
    tree.add(new Relastionships(parent, Relationship.parent, children));
    tree.add(new Relastionships(children, Relationship.child, parent));
    for(Relastionships t:tree)
{
if((t.p1==parent)&(t.p2 != children)&((t.re==Relationship.father)|(t.re==Relationship.mother)))
    {
    treeofsiblings.add(new Relastionships(children, Relationship.siblings, t.p2));
    treeofsiblings.add(new Relastionships(t.p2, Relationship.siblings,children ));
    }
if(((t.re==Relationship.sister|t.re==Relationship.brother)) &(t.p2==children))
treeofsiblings.clear();
}

tree.addAll(treeofsiblings);
treeofsiblings.clear();

}

  public void showtree()
  {
    System.out.println("--------");
    for(Relastionships t : tree)
    {
        System.out.println(t.toString());
    }
    System.out.println("--------");
  }
}

