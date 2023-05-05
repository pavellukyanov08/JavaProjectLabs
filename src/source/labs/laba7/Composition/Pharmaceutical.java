package source.labs.laba7.Composition;

import java.util.*;

public class Pharmaceutical {
    class Medication {
        int id;
        String name;
        double price;

        public Medication(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        public String toString() {
            return String.format("%d\t %s\t %10.2f p.", this.id, this.name, this.price);
        }
    }
    public int id;
    public String name;
    public ArrayList<Medication> med;
    public Pharmaceutical() {
        this.med = new ArrayList<Medication>();
    }
    public Medication CreateMedication(int id, String name, double price) {
        Medication m = new Medication(id, name, price);
        return m;
    }
    public String toString() {
        String s = String.format("%d\t %s\n", this.id, this.name);
        for (Pharmaceutical.Medication k : this.med)
            s += String.format("%s\n", k);
        return s;
    }
}
