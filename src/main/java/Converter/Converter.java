package Converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value) {
        float rsl2 = value / 60;
        return rsl2;
    }
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(70);
        float dollar = Converter.rubleToDollar(60);
        System.out.println(" 70 rubles are " + euro + " euro ");
        System.out.println(" 60 rubles are " + dollar + " dollar ");

    }
}
