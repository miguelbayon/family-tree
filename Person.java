import java.util.ArrayList;

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
    private ArrayList<Person> children;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        children = new ArrayList<Person>();
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
    
    public void addChild(Person child) {
        children.add(child);
    }
    
    public void showParentsData() {
        System.out.println("Datos del padre:");
        father.showData();
        System.out.println("Datos de la madre:");
        mother.showData();
    }
    
    public boolean hasChildren() {
        return (children.size() > 0);
    }
    
    public int getNumberOfChildren() {
        return children.size();
    }
    
    public boolean hasBrothers() {
        return (father.getNumberOfChildren() > 1);
    }
    
    
    
    
    
    

}
