package Soal1;

public class fahrenheit {
    double t;

    public fahrenheit() {
    }

    public fahrenheit(double t) {
        this.t = t;
    }

    public void setT(double t) {
        this.t = t;
    }

    private double celcius() {
        return 0.556 * (t - 32);
    }

    private double kelvin() {
        return 0.5556 * (t - 32) + 273;
    }

    private double reamur() {
        return 0.4444 * (t - 32);
    }

    public void d() {
        System.out.println("Celcius : " + celcius());
        System.out.println("Kelvin : " + kelvin());
        System.out.println("Reamur : " + reamur());
    }
}
