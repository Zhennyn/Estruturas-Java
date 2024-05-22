import java.util.Locale;
import java.util.Scanner;

public class Casos {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o samanho da roupa P/M/G");
            String tamanho = scanner.next();

            switch (tamanho) {
                case "P" ->  {
                    System.out.println("PEQUENO");
                }

                case "M" ->  {
                    System.out.println("MEDIO");
                }

                case "G" ->  {
                    System.out.println("GRANDE");
                }

                default ->  {
                    System.out.println("INDEFINIDO");
                }
            }
        }
    }
}
