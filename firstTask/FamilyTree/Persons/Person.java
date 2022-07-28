package FamilyTree.Persons;

import java.util.ArrayList;

import FamilyTree.Enums.Sex;
import FamilyTree.Statics.Id;

public class Person {

  private String fullName;
  private Sex sex ;
  private ArrayList<Person> children = new ArrayList<>();
  private Integer id ;

  public Person(String fullName,Sex sex) {
    this.fullName = fullName;
    this.sex = sex;
    id = Id.createID();
  }

  public Person(Sex sex) {
    this( "unknown",sex);
  }

  public String getFullName() {
    return fullName;
  }

  public Sex getSex() {
    return sex;
  }

  public Integer getid() {
    return id;
  }

  public void ChildAdd(Person child) {
       children.add(child);
  }
  
  @Override
  public String toString() {
    String result ;
    String SonsAndDaugthers ="" ;
      for(Person child : children){
       SonsAndDaugthers= SonsAndDaugthers + child.fullName + "; ";
      }
      result = ("id:"+id+" name: " +fullName +", sex: " +sex+ ", his children: "+ SonsAndDaugthers);
    
    return String.format(result);
  }

}
