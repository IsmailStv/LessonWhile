public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        System.out.println("My name is " + person1.name + ", " + person1.age + " old.");
        Person person2 = new Person();
        person2.name = "Mike";
        person2.age = 20;
        System.out.println("My name is " + person2.name + ", " + person2.age + " years.");
    }
}
class Person{
    String name;
    int age;
}