package settimurari;

import java.io.*;
import java.text.*;

public class Setto implements Serializable {

    private double t0, e, g, h, l, t, s0, n, v, j, k, d;

    public Setto(double t0, double e, double g, double h, double l, double t, double s0, double n) {
        this.t0 = t0;
        this.e = e;
        this.g = g;
        this.h = h;
        this.l = l;
        this.t = t;
        this.s0 = s0;
        this.n = n;
    }

    public double getT0() {
        return t0;
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

    public double getV() {
        return v;
    }

    public double getJ() {
        return j;
    }

    public double getK() {
        return k;
    }

    public double getD() {
        return d;
    }

    public void calcola() {
        double b = h / l;
        if (b < 1) {
            b = 1;
        } else if (b > 1.5) {
            b = 1.5;
        }
        v = l * t * (1.5 * t0 / b) * Math.sqrt(1 + (s0 / (1.5 * t0)));
        j = l * h * h * h / 12;
        k = 1 / ((h * h * h / (n * e * j)) + (1.2 * h / (g * l * t)));
        d = v / k;
    }

    @Override
    public String toString() {
        String ret = ""
                + "𝜏o = " + t0 / 10 + " N/mmq\n"
                + "E = " + e / 10 + " N/mmq\n"
                + "G = " + g / 10 + " N/mmq\n"
                + "h = " + h + " cm\n"
                + "l = " + l + " cm\n"
                + "t = " + t + " cm\n"
                + "σo = " + s0 / 10 + " N/mmq\n"
                + "n = " + n + "\n"
                + "\n"
                + "V = l * t * (1.5 * 𝜏o / b) * √(1 + (σo / (1.5 * 𝜏o))) = " + new DecimalFormat("0.00").format(v) + " daN\n"
                + "K = 1 / ((h^3 / (n * E * J)) + (1.2 * h / (G * A) )) = " + new DecimalFormat("0.00").format(k) + " daN/cm\n"
                + "δo = V/K = " + new DecimalFormat("0.00").format(d) + " cm";
        return ret;
    }

}
