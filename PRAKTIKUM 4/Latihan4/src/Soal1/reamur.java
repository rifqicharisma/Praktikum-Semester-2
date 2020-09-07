package Soal1;

public class reamur {
    double tmp;

    public reamur() {
    }

    public reamur(double tmp) {
        this.tmp = tmp;
    }

    public void setTmp(double tmp) {
        this.tmp = tmp;
    }

    private double celcius() {
        return 1.25 * tmp;
    }

    private double fahrenheit() {
        return 2.25 * tmp + 32;
    }

    private double kelvin() {
        return 1.25 * tmp + 273;
    }

    public void display() {
        System.out.println("Celcius : " + celcius());
        System.out.println("Fahrenheit : " + fahrenheit());
        System.out.println("Kelvin : " + kelvin());
    }
}
