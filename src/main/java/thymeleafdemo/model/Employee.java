package thymeleafdemo.model;

public class Employee {
    private int id;
    private String fistName;
    private String lastName;
    private String email;

    public int getId() {
        return id;
    }
@Override
public String toString(){
        return "Employee [id=" + id + ",firstName=" + fistName + ",lastName=" + lastName + ",email=" + email + "]";
}
    public Employee(int id, String fistName, String lastName, String email) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
