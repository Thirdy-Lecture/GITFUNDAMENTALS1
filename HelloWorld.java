
//main class

public class Main {
  public static void main(String[] args) {
    Person per = new Person();
    per.setName("Sandro Hobayan");
    System.out.println("Hello my name is " + per.getName());
  }
}






//name class

public class Person {
   private String name;


  
   public String getName() {
     return name;
   }

  
  public void setName(String newName) {
     this.name = newName;
   }
}

                  



