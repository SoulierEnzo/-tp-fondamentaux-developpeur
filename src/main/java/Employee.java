package main.java;

/**
 * Représente un employé dans une entreprise.
 * Chaque employé possède un identifiant unique, un nom et un poste.
 */
public class Employee {

    /**
     * Identifiant unique de l'employé.
     */
    private int id;

    /**
     * Nom de l'employé.
     */
    private String name;

    /**
     * Poste de l'employé dans l'entreprise.
     */
    private String position;

    /**
     * Constructeur de la classe Employee.
     * 
     * @param id       l'identifiant unique de l'employé.
     * @param name     le nom de l'employé.
     * @param position le poste de l'employé.
     */
    public Employee(
        int id,
        String name,
        String position
    ) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    /**
     * Retourne l'identifiant unique de l'employé.
     * 
     * @return l'identifiant de l'employé.
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne le nom de l'employé.
     * 
     * @return le nom de l'employé.
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le poste de l'employé dans l'entreprise.
     * 
     * @return le poste de l'employé.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères des détails de l'employé.
     * 
     * @return une chaîne contenant l'ID, le nom et le poste de l'employé.
     */
    @Override
    public String toString() {
        return "ID : " + id + "\nName : " + name + "\nPosition : " + position;
    }
}
