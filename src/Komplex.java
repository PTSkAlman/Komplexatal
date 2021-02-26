public class Komplex {

    public double Re;
    public double Im;

    public Komplex(double r, double i) {
        Re = r;
        Im = i;
    }
    @Override
    public String toString() {
        return Re + " + " + Im + "i";
    }
    public void add (Komplex komplex) {

    }
}
