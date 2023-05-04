package source.labs.laba7.Composition;

import java.util.ArrayList;
import java.util.Date;

public class Pharmaceutical {
    class Employee {
        int id;
        String name;
        double salary;
        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public String toStirng() {
            return String.format("%d\t %s\t %10.2f p.", this.id, this.name, this.salary);
        }
    }
    public int id;
    public String name;
    public ArrayList<Employee> emp;
        public Pharmaceutical() {
            this.emp = new ArrayList<Employee>();
        }
        public Employee CreateEmployee(int id, String name, double salary) {
            Employee e = new Employee(id, name, salary);
            return e;
        }
        @Override public String toString() {
            String s = String.format("%d\t %s\n", this.id, this.name);
            for (Pharmaceutical.Employee k : this.emp)
                s += String.format("%s\n", k);
            return s;
        }
}
