public class ClassesAndObjects26 {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setAge(17);
        person1.setName("Roman");
        System.out.println("Output the value in the main method: " + person1.getName() + ".");
        System.out.println("Output the value in the main method: " + person1.getAge() + ".");
        person1.sayHallo();
        person1.speak();
    }
}
class Person{
    private String name;
    private int age;

    public void setName(String username){
        name = username;
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        age = userAge;
    }

    public int getAge() {
        return age;
    }

    void speak(){
        for(int i = 0; i < 3; i++){
        System.out.println("My name " + name + ", " + age + " age.");
        }
    }
    void sayHallo(){
        System.out.println("Hallo!");
    }
}