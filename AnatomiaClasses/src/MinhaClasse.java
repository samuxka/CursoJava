public class MinhaClasse {
    /*public static void main(String[] args) {
        System.out.print("olá pessoal");*/

    public static void main (String [] args) {
        String primeiroNome = "Samuel";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }    

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}