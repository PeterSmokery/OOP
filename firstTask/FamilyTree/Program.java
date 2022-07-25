package FamilyTree;
import java.util.ArrayList;
 
public class Program {

  public static void main(String[] args) {
Person p1 = new Person("Valera", sex.man);
p1.printid();
Person p2 = new Person("Irina",sex.women);
Person p3 = new Person(sex.man);
Person p4 = new Person("Masha",sex.women);
Person p5 = new Person("Jenya",sex.women);
Person p6 = new Person("Vanya",sex.man);
Person p7 = new Person("gosha",sex.man);
p7.printid();
Person p8 = new Person("gosha",sex.man);



System.out.println( p1.toString());
System.out.println("------");
System.out.println(p3.toString());

FamilyTree Kastro = new FamilyTree();

//Kastro.append(p1, p1);

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

Kastro.showtree();

System.out.println("------");
new reserch(Kastro).findchildren(p1);
System.out.println("------");
new reserch(Kastro).findParents(p4);
System.out.println("------");
new reserch(Kastro).findSiblings(p4);
System.out.println("------");
new reserch(Kastro).fullreserch(p5);
}

}

 enum Relationship {
  mother,
  father,
  parent,
  son,
  daugther,
  child,
  siblings,
  brother,
  sister
}

 enum sex{
  man ,
  women 
}
  
 




