package Fit;

public class Fit {
    public static double man (short hei) {
        double rsl = (hei - 100) * 1.15;
        return rsl;
    }
    public static double woman (short hei2) {
        double rsl2 =(hei2 - 100) * 1.15;
        return rsl2;
    }
    public static void main (String[] args){
        short hei = 181;
        short hei2 = 170;
        double man = Fit.man(hei);
        double woman = Fit.woman(hei2);
        System.out.println("Man 181 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
