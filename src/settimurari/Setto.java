package settimurari;

import java.text.*;

public class Setto {

    private double to;
    private double e;
    private double g;
    private double h;
    private double l;
    private double t;
    private double s0;
    private double n;

    private double v;
    private double j;
    private double k;
    private double d;

    public Setto(double to, double e, double g, double h, double l, double t, double s0, double n) {
        this.to = to;
        this.e = e;
        this.g = g;
        this.h = h;
        this.l = l;
        this.t = t;
        this.s0 = s0;
        this.n = n;
    }

    public double getTo() {
        return to;
    }

    public double getE() {
        return e;
    }

    public double getG() {
        return g;
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }

    public double getT() {
        return t;
    }

    public double getS0() {
        return s0;
    }

    public double getN() {
        return n;
    }

    public void calcola() {
        double b = h / l;
        if (b < 1) {
            b = 1;
        } else if (b > 1.5) {
            b = 1.5;
        }
        v = l * t * (1.5 * to / b) * Math.sqrt(1 + (s0 / (1.5 * to)));
        j = l * h * h * h / 12;
        k = 1 / ((h * h * h / (n * e * j)) + (1.2 * h / (g * l * t)));
        d = v / k;
    }

    @Override
    public String toString() {
        String ret = ""
                + "to = " + to + " N/mmq\n"
                + "e = " + e + " N/mmq\n"
                + "g = " + g + " N/mmq\n"
                + "h = " + h + " cm\n"
                + "l = " + l + " cm\n"
                + "t = " + t + " cm\n"
                + "s0 = " + s0 + " N/mmq\n"
                + "n = " + n + "\n"
                + "\n"
                + "V = l * t * (1.5 * 𝜏o / b) * Math.sqrt(1 + (σ0 / (1.5 * 𝜏o))) = " + new DecimalFormat("0.00").format(v) + "\n"
                + "J = l * h^3 / 12 = " + new DecimalFormat("0.00").format(j) + "\n"
                + "K = 1 / ((h^3 / (n * E * J)) + (1.2 * h / (G * A) )) = " + new DecimalFormat("0.00").format(k) + "\n"
                + "D = V/K = " + new DecimalFormat("0.00").format(d);
        return ret;
    }

}
