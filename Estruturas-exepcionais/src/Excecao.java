
import java.text.NumberFormat;
import java.text.ParseException;

public class Excecao {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException ex) {
        }
    }

}
