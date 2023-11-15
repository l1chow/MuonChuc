package session3;

import java.util.Scanner;

public class Employee {
    private String fullName;
    private String id;

    public Employee() {
    }

    public Employee(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input full name: ");
        fullName = sc.nextLine();
        System.out.print("Input id: ");
        id = sc.nextLine();
    }
    
    @Override
    public String toString() {
        return "Employee{" + "fullName=" + fullName + ", id=" + id + '}';
    }
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.inputInfo();
        System.out.println(e.toString());
    }
}
