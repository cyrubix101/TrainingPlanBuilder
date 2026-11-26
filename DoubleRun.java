public class DoubleRun extends Run{

    private String name2;
    private double milage2;

    public DoubleRun(double date, String name, double milage, String name2, double milage2) {
        super(date, name, milage);

        this.name2 = name2;
        this.milage2 = milage2;

    }

    public String getName2() {
        return name2;
    }

    @Override 
    public double getMilage() {
        return milage + milage2;
    }

    @Override 
    public String toString() {
        return name + " + " + name2 + ": " + milage + "," + milage2;
    }
}
