package AlertDivByZero.ru.job4j;

public class condition {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }
    public static void possibleDiv(int number){
        if (number == 0){
            System.out.println("Could not div by 0.");
        }

    }
}
