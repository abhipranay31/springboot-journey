class Student {
  String name;
  int age;

  Student (String name , int age){
    this.name = name;
    this.age = age;
  }
  void introduce() {
    System.out.println(name);
    System.out.println(age);
  }
} 
  
  

public class Main{
  public static void main(String[] args){
    Student s1 = new Student("Ravi" , 18);
     
    Student s2 = new Student("Priya" , 19);


        s1.introduce();
        s2.introduce();

  }
}