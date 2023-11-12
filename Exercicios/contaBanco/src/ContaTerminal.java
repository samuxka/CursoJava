import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String AGENCIA = "067-8";
        String USUARIO = "Samuel Santos";
        String SENHA = "Sa_muka08";
        double saldo = 1357.00;

        System.out.println("Por Favor, informe seu nome");
        System.out.print("Nome: ");
        String digUsuario = scanner.nextLine();
        System.out.println("Por Favor, informe sua senha");
        System.out.print("Senha: ");
        String digSenha = scanner.nextLine();
        System.out.println("Por Favor, informe a agência");
        System.out.print("Agência: ");
        String digAgencia = scanner.nextLine();
        if (!digAgencia.equals(AGENCIA) || !digUsuario.equals(USUARIO) || !digSenha.equals(SENHA)) {
            System.out.println("Informações de login estão incorretas");
        } else {
            System.out.println("Olá " + USUARIO + ", obrigado por usar nosso banco, sua agência é " + AGENCIA  + ", e seu saldo R$" + saldo + " já está disponível para saque");
        }        
    }
}

