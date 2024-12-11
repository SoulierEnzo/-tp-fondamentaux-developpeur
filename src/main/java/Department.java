package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un département dans une entreprise.
 * Un département contient un nom et une liste d'employés.
 */
public class Department {

    /**
     * Nom du département.
     */
    private String name;

    /**
     * Liste des employés dans le département.
     */
    private List<Employee> employees;

    /**
     * Initialise un nouveau département avec un nom spécifié.
     * La liste des employés est initialisée vide.
     * 
     * @param name Le nom du département.
     * @throws IllegalArgumentException si le nom est null ou vide.
     */
    public Department(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du département ne peut pas être vide.");
        }
        this.name = name;
        this.employees = new ArrayList<>(); // Pré-initialise la liste des employés.
    }

    /**
     * Ajoute un employé au département.
     * 
     * @param employee L'employé à ajouter.
     * @throws NullPointerException si l'employé est null.
     */
    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new NullPointerException("employee is null");
        }
        employees.add(employee);
    }

    /**
     * Retire un employé du département.
     * 
     * @param employee L'employé à retirer.
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Retourne la liste des employés du département.
     * Cette méthode renvoie une nouvelle liste pour éviter toute modification externe de la liste originale.
     * 
     * @return Une copie de la liste des employés.
     */
    public List<Employee> listEmployees() {
        return new ArrayList<>(employees);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères des employés du département.
     * Chaque employé est affiché sur une ligne distincte.
     * 
     * @return Une chaîne représentant tous les employés du département.
     */
    @Override
    public String toString() {
        String result = "";
        for (Employee employee : listEmployees()) {
            result += employee.toString() + "\n";
        }
        return result;
    }
}
