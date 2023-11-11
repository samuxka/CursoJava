//int, byte, short, long, float, double, boolean e char "Não são considerados objetos"
public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        int numero = 5;
        numero = 10;

        final double Valor_De_Pi = 3.14;

        System.out.print(numero);
    }
}