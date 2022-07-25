package FamilyTree;


class Relastionships {
    Person p1;
    Relationship re;
    Person p2;

    public Relastionships(Person p1, Relationship re, Person p2) {
        if(p1 == p2)
        {
            System.out.println("записывается одна и та же личность");
            System.exit(1);
        }
        else{
        if((re == Relationship.parent)&& (p1.getSex()==sex.man)) 
        {
        p1.childrenfound();
         this.p1 = p1;
         this.re = Relationship.father;
         this.p2 = p2;
        }
        if((re==Relationship.parent)&& (p1.getSex()==sex.women) )
        {
        p1.childrenfound();
        this.p1 = p1;
        this.re = Relationship.mother;
        this.p2 = p2;
        }
        if((re==Relationship.child)&&(p1.getSex()==sex.women))
        {
        this.p1 = p1;
        this.re = Relationship.daugther;
        this.p2 = p2;
        }
        if((re==Relationship.child)&&(p1.getSex()==sex.man))
        {
        this.p1 = p1;
        this.re = Relationship.son;
        this.p2 = p2;
        }
        if((re == Relationship.siblings)&& (p1.getSex()==sex.man)) 
        {
         this.p1 = p1;
         this.re = Relationship.brother;
         this.p2 = p2;
        }
        if((re == Relationship.siblings)&& (p1.getSex()==sex.women)) 
        {
         this.p1 = p1;
         this.re = Relationship.sister;
         this.p2 = p2;
        }
    }
    }
   

   
     @Override
     public String toString() {
         return String.format("<%s is %s to %s>", p1, re, p2);
     }
  }