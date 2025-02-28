import java.util.Scanner;

public class SistemaSeguranca {
    public static void main(String[] args) {
        // Definição das senhas corretas
        final String SENHA1_CORRETA = "1234";
        final String SENHA2_CORRETA = "5678";
        final String SENHA_MESTRE = "9999"; // Senha mestre da agência
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== SISTEMA DE SEGURANÇA ===");
            
            // Pedir a primeira senha
            System.out.print("Digite a primeira senha: ");
            String senha1 = scanner.nextLine();
            
            if (senha1.equals(SENHA1_CORRETA)) {
                System.out.print("Digite a segunda senha: ");
                String senha2 = scanner.nextLine();
                
                if (senha2.equals(SENHA2_CORRETA)) {
                    System.out.println("Acesso concedido! Cofre aberto.");
                } else {
                    System.out.println("Segunda senha incorreta!");
                    System.out.print("Digite a senha mestre: ");
                    String senhaMestre = scanner.nextLine();
                    
                    if (senhaMestre.equals(SENHA_MESTRE)) {
                        System.out.println("Acesso concedido com a senha mestre! Cofre aberto.");
                    } else {
                        System.out.println("Senha mestre incorreta! Acesso negado.");
                    }
                }
            } else {
                System.out.println("Primeira senha incorreta! Acesso negado.");
            }
        }
    }
}

