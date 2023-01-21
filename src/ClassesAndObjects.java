public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Roman");
        person1.age = 50;
        String s1 = "Roman";
        person1.speak();
        int year1 = person1.calculateYearsToRetirement();
        Person person2 = new Person();
        person2.name = "Mike";
        person2.age = 20;
        person2.sayHallo();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Until retirement is left " + year1 + " and " + year2);


    }
}
class Person{
    String name;
    int age;
    void setName(String userName){
        name = userName;
    }
    int calculateYearsToRetirement(){
        int year = 65 - age;
        return year;
//        System.out.println("Until retirement is left " + years);
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