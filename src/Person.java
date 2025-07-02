public class Person {
    String name;
    String role;


    public Person (String name, String role) {
        this.name = name;
        this.role= role;
    }

    public void setName() {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setRole() {
        this.role = role;
    }

    public String getRole() {
       return role;
    }


    public void display() {
        System.out.println("Name " + name + "role " + role);
    }

}
