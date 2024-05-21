public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 30.0;
        double saque = 30.0;

        if (saque < saldo) {
            saldo = saldo - saque;
            System.out.println(saldo);
        }

        else {
            System.out.println("O valor solicitado não está disponivel");
        }
    }

}
