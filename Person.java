import java.util.ArrayList;

/**
 * Implementación de una persona que tiene nombre, edad y puede tener un padre, 
 * una madre e hijos.
 * 
 * @author Miguel Bayon Alonso
 * @version 1.0
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

    /**
     * Muestra por pantalla el nombre y la edad de una persona
     */
    public void showData() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }
    
    /**
     * Setter del atributo father
     * @param father El padre de la persona
     */
    public void setFather(Person father) {
        this.father = father;
    }
    
    /**
     * Setter del atributo mother
     * @param mother La madre de la persona
     */
    public void setMother(Person mother) {
        this.mother = mother;
    }
    
    /**
     * Añade un hijo a la persona
     * @param child El nuevo hijo de la persona
     */
    public void addChild(Person child) {
        children.add(child);
    }
    
    /**
     * Muestra por pantalla el nombre y edad del padre y la madre de la persona
     */
    public void showParentsData() {
        System.out.println("Datos del padre:");
        father.showData();
        System.out.println("Datos de la madre:");
        mother.showData();
    }
    
    /**
     * Devuelve si una persona tiene hijos o no
     * @return Devuelve true si la persona tiene hijos y false en caso contrario
     */
    public boolean hasChildren() {
        return (children.size() > 0);
    }
    
    /**
     * Devuelve el número de hijos de una persona
     * @return Numero de hijos de una persona
     */
    public int getNumberOfChildren() {
        return children.size();
    }
    
    /**
     * Devuelve si una persona tiene hermanos o no
     * @return Devuelve true si la persona tiene hermanos y false en caso contrario
     */
    public boolean hasBrothers() {
        return (father.getNumberOfChildren() > 1);
    }
    
    
    
    
    
    

}
