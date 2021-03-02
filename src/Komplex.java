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

    public Komplex add (Komplex komplex) {
        double addRe = this.Re + komplex.Re;
        double addIm = this.Im + komplex.Im;
        return new Komplex(addRe, addIm);
    }
}
