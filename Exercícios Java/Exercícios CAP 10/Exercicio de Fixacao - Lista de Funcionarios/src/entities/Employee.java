package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) { //Considerei que o Id poderá ser mudado futuramente.
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary (double percentagem){
        salary *= (1+percentagem/100);
    }
    public String toString(){

        return id
                +", "
                +name
                +", "
                +String.format("%.2f",salary);
    }
}//Final da Classe
