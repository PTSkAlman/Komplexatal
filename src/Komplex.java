import java.util.Objects;

public class Komplex {

    public double Re;
    public double Im;

    public Komplex(double r, double i) {
        Re = r;
        Im = i;
    }

    //Hur en komplex ska se ut
    @Override
    public String toString() {
        return Re + " + " + Im + "i";
    }

    //Addera två tal med varandra
    public Komplex add(Komplex komplex) {
        double r = this.Re + komplex.Re;
        double i = this.Im + komplex.Im;
        return new Komplex(r, i);
    }

    //Multiplicera två komplexa tal med varandra
    public Komplex multiply(Komplex komplex) {
        double r = this.Re * komplex.Re + this.Im * komplex.Im * -1;
        double i = this.Re * komplex.Im + this.Im * komplex.Re;
        return new Komplex(r, i);
    }

    //Arctan på en komplex
    public double arg() {
        return Math.atan(this.Im/this.Re);
    }

    //Kolla om två komplexa tal är lika med varandra
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.Re, Re) == 0 &&
                Double.compare(komplex.Im, Im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Re, Im);
    }
}
