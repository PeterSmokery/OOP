package FamilyTree;


class Person {

    private String fullName;
    private sex sex ;
    private int children;
    private static Integer id ;

    static{
      id = 0;
    }

    public String getFullName() {
      return fullName;
    }
    public sex getSex() {
        return sex;
      }
      
    public Person(String fullName,sex sex) {
      this.fullName = fullName;
      this.sex = sex;
      children = 0;
      id++;
    }
    public Person(sex sex)
    {
      this( null,sex);
      children = 0;
      id++;
    }
    public void childrenfound()
    {
         children ++;
    }

    public void printid(){
      System.out.print(id);
    }
  
    
    @Override
    public String toString() {
      if(fullName==null){
        fullName="unknown";
      }
        return String.format("name: " +fullName +", sex: " +sex+ ", children have: " + children );
    }
  }
