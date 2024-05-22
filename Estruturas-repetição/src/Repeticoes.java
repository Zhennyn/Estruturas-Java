import java.util.Random;

public class Repeticoes {
    public static void main(String[] args) throws Exception {

        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");

        } while (tocando());
            System.out.println("Alô !!!!");

        /* NÃO ESQUEÇA DE ATIVAR A FUNÇÃO VALOR ALEATORIO NO FINAL DO CÓDIGO
         * double mesada = 50.0;
         * 
         * while (mesada > 0) {
         * Double valorDoce = valorAleatorio();
         * if (valorDoce > mesada)
         * valorDoce = mesada;
         * 
         * System.out.println("Doce do valor: " + valorDoce +
         * " Adicionado no carrinho");
         * mesada = mesada - valorDoce;
         * }
         * 
         * System.out.println("Mesada: " + mesada);
         * System.out.println("Joãozinho gastou toda a sua mesada em doces");
         */

        /*
         * for(int numero = 1; numero <=5; numero ++){
         * if(numero == 3);
         * continue;
         * 
         * System.out.println(numero);
         * }
         */

        /*
         * for (int carneirinhos = 1; carneirinhos <=20; carneirinhos ++ ) {
         * System.out.println("Contando carneirinhos " + carneirinhos);
         * }
         */

        // em arrays o indice inicia em 0
        /*
         * String alunos[] = {"FELIPE", "MARIA", "MATHEUS", "GABI"};
         * 
         * for(int x=0; x<alunos.length; x++)
         * 
         * System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
         */

    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }

    /*
     * private static double valorAleatorio() {
     * return ThreadLocalRandom.current().nextDouble(2, 15);
     */
}
