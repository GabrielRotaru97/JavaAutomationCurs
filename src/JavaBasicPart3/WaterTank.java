package JavaBasicPart3;

public class WaterTank {
    private double lungime;
    private double latime;
    private double inaltime;

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double transform(String a) {
        String[] transform = a.split(" ");

        switch (transform[1]) {
            case "m":
                return Double.parseDouble(transform[0]);
            case "dm":
                return Double.parseDouble(transform[0]) / 10;
            case "cm":
                return Double.parseDouble(transform[0]) / 100;
            default:
                return 1;

        }
    }

    public double volume() {
        return lungime * latime * inaltime;
    }

    public int numberOfBottles() {
        int volumeInLiters = (int) (volume() * 1000);
        int numberOfBottles = (int) (volumeInLiters / 0.5);
        return numberOfBottles;
    }

}
