public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Mike";
        person2.age = 20;
        person2.sayHallo();
    }
}
class Person{
    String name;
    int age;
    void speak(){
        for(int i = 0; i < 3; i++){
        System.out.println("My name " + name + ", " + age + " age.");
        }
    }
    void sayHallo(){
        System.out.println("Hallo!");
    }
}