package Soal1;

public class celcius {
    double tmp;

    public celcius() {
    }

    public celcius(double tmp) {
        this.tmp = tmp;
    }

    public void setTmp(double tmp) {
        this.tmp = tmp;
    }

    private double fahrenheit() {
        return (1.8 * tmp) + 32;
    }

    private double kelvin() {
        return tmp + 273;
    }

    private double reamur() {
        return 0.8 * tmp;
    }

    public void display() {
        System.out.println("Fahrenheit : " + fahrenheit());
        System.out.println("Kelvin : " + kelvin());
        System.out.println("Reamur : " + reamur());
    }
}
