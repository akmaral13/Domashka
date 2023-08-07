import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String juma=scanner.nextLine();
        Kundor Kundop1=Kundor.valueOf(juma);

        switch (Kundop1){
            case ДУЙШОМБУБ -> System.out.println("Джавада жаны тема");
            case ШЕЙШЕМБИ -> System.out.println("Техникалык английский");
            case ШАРШЕМБИ -> System.out.println("java сабагы");
            default -> System.out.println("Мындай сабак жок");

        }
    }
}