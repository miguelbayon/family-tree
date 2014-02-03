
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    private Person father;
    private Person mother;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
    
    public void setFather(Person father) {
        this.father = father;
    }
    
    public void setMother(Person mother) {
        this.mother = mother;
    }

}
