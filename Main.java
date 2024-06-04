public class Main {
  int x = 5;
  

  
  public void main(String[] args) {

    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    
    final String Name = "Yogesh";
    System.out.println(Name.toUpperCase());

    float age = 30.45f;
    float refined = (float) age;
    System.out.println(refined);

    if (Name == "Yogesh" && age > 20) {
      System.out.println("My name is " + Name + " and  age is " + age);
    
      
    } else {
      System.out.println("no hay nombre");
      
    }

  }
}


