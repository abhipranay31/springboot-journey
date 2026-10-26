class Student {
  String name;
  int age;

  void introduce() {
    System.out.println(name);
    System.out.println(age);
  }
}

public class Main{
  public static void main(String[] args){
    Student s1 = new Student();

        s1.name = "Ravi";
        s1.age = 18;

        Student s2 = new Student();

        s2.name = "Priya";
        s2.age = 19;

        s1.introduce();
        s2.introduce();

  }
}