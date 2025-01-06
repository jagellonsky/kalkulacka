import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean pokracovat = true;
        while (pokracovat) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vyber si jednu z možností");
        System.out.println("1: Spojení dvou řetězců.");
        System.out.println("2: Zjištění délky řetězce.");
        System.out.println("3: Převod řetězce na velká/malá písmena");
        System.out.println("4: Generování náhodného čísla v zadaném rozsahu.");
        System.out.println("5: Výpočet druhé mocniny čísla.");
        System.out.println("6: Ukončení programu");
        int moznost = sc.nextInt();
        if (moznost == 1) {
            System.out.println("Vybral jsi si 1: Spojení dvou řetězců.");
            System.out.println("napiš první řetězec");
            sc.nextLine();
            String slovo1 = sc.nextLine();
            System.out.println("napiš druhý řetězec");
            String slovo2 = sc.nextLine();
            System.out.println("spojení řetězců je "+slovo1+""+slovo2);

        }
        if (moznost == 2) {
            System.out.println("Vybral jsi si 2: Zjištění délky řetězce.");
            System.out.println("napiš řetězec");
            String slovo = sc.nextLine();
            System.out.println("Slovo je "+slovo.length()+" písmen/a dlouhé");
        }
        if (moznost == 3) {
            System.out.println("Vybral jsi si 3: Převod řetězce na velká/malá písmena");
            System.out.println("napiš řetězec");
            sc.nextLine();
            String Slovo = sc.nextLine();
            System.out.println("Chceš čísla na velké nebo malé?");
            String vyber = sc.nextLine();
            if (vyber.equals("velke")){
                System.out.println(Slovo.toUpperCase());
            }
            if (vyber.equals("male")){
                System.out.println(Slovo.toLowerCase());
            }

        }
        if (moznost == 4) {
            System.out.println("Vybral jsi si 4: Generování náhodného čísla v zadaném rozsahu.");
            System.out.println("Vyber si spodní hranici");
            int hranice1 = sc.nextInt();
            System.out.println("Vyber si horní hranici");
            int hranice2 = sc.nextInt();
            Random random = new Random();
            System.out.println(random.nextInt(hranice1,hranice2));
        }
        if (moznost == 5) {
            System.out.println("Vybral jsi si 5: Výpočet druhé mocniny čísla.");
            System.out.println("Zadej číslo");
            int druhamocnina = sc.nextInt();
            System.out.println("Výpočet druhé mocniny čísla je "+druhamocnina*druhamocnina);
        }
        if (moznost == 6) {
            System.out.println("Vybral jsi si 6: Ukončení programu");
            pokracovat = false;
        }



    }
    }
}