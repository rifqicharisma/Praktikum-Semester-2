package Soal1;

public class kelvin {
    double tmp;

    public kelvin() {
    }

    public kelvin(double tmp) {
        this.tmp = tmp;
    }

    public void setTmp(double tmp) {
        this.tmp = tmp;
    }

    private double celcius() {
        return tmp - 273;
    }

    private double fahrenheit() {
        return 1.8 * (tmp - 273) + 32;
    }

    private double reamur() {
        return 0.8 * (tmp - 273);
    }

    public void display() {
        System.out.println("Celcius : " + celcius());
        System.out.println("Fahrenheit : " + fahrenheit());
        System.out.println("Reamur : " + reamur());
    }
}
