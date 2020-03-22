package settimurari;

import java.io.*;
import java.text.*;

public class Setto implements Serializable {

    private double t0, e, g, h, l, t, s0, fm, n, vt, vu, j, k, de, bigMu, vpf, mu, du, du_max;

    public Setto(double t0, double e, double g, double h, double l, double t, double s0, double fm, double n) {
        this.t0 = t0;
        this.e = e;
        this.g = g;
        this.h = h;
        this.l = l;
        this.t = t;
        this.s0 = s0;
        this.fm = fm;
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
        return vt;
    }

    public double getJ() {
        return j;
    }

    public double getK() {
        return k;
    }

    public double getDe() {
        return de;
    }

    public double getVt() {
        return vt;
    }

    public double getVpf() {
        return vpf;
    }

    public double getMu() {
        return mu;
    }

    public double getDu() {
        return du;
    }

    public double getFm() {
        return fm;
    }

    public double getBigMu() {
        return bigMu;
    }

    public void calcola() {
        double b = h / l;
        if (b < 1) {
            b = 1;
        } else if (b > 1.5) {
            b = 1.5;
        }
        vt = l * t * (1.5 * t0 / b) * Math.sqrt(1 + (s0 / (1.5 * t0)));
        j = l * h * h * h / 12;
        k = 1 / ((h * h * h / (n * e * j)) + (1.2 * h / (g * l * t)));

        bigMu = (s0 * (t) * (l) * (l) / 2) * (1 - (s0 / (0.85 * fm)));

        if (n == 3) {
            vpf = bigMu / h;
        } else if (n == 12) {
            vpf = 2 * bigMu / h;
        } else {
            vpf = 0;
        }

        vu = (vt < vpf) ? vt : vpf;
        de = vu / k;
        mu = (vu == vt) ? 1.5 : 2;
        double mu_max = (vu == vt) ? 0.004 : 0.006;

        du = de * mu;
        du_max = mu_max * h;
        if (du > du_max) {
            du = du_max;
        }

    }

    @Override
    public String toString() {
        String ret = ""
                + "𝜏o = " + t0 + " N/mmq\n"
                + "E = " + e + " N/mmq\n"
                + "G = " + g + " N/mmq\n"
                + "h = " + h / 10 + " cm\n"
                + "l = " + l / 10 + " cm\n"
                + "t = " + t / 10 + " cm\n"
                + "σo = " + s0 + " N/mmq = " + new DecimalFormat("###,###.###").format(s0 *10) + " daN/cmq\n"
                + "fm = " + fm + " N/mmq\n"
                + "n = " + n + " \n"
                + "\n"
                + "Vt = l * t * (1.5 * 𝜏0 / b) * √(1 + (σo / (1.5 * 𝜏o))) = " + new DecimalFormat("###,###").format(vt/10) + " daN\n"
                + "Vpf = " + new DecimalFormat("###,###").format(vpf/10) + " daN\n"
                + "Vu = " + new DecimalFormat("###,###").format(vu/10) + " daN\n"
                + "K = 1 / ((h^3 / (n * E * J)) + (1.2 * h / (G * A) )) = " + new DecimalFormat("###,###").format(k) + " daN/cm\n"
                + "δe = Vu/K = " + new DecimalFormat("###,###.###").format(de) + " mm\n"
                //+ "Mu = (s0 * t * l * l / 2) * (1 - s0 / (0.85 * fm)) = " + new DecimalFormat("###,###").format(bigMu) + " daN*cm\n"
                + "μ = " + new DecimalFormat("###,###.###").format(mu) + " \n"
                + "δu = δe * μ = " + new DecimalFormat("###,###.###").format(du) + " mm < δumax = " + new DecimalFormat("###,###.###").format(du_max) + " mm";
        return ret;
    }

}
