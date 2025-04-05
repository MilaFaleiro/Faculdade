public class helloWorld // O nome da classe tem que ser igual ao do arquivo.
{ 
    public static void main(String[] args) {
        // Aqui dentro vai o que o programa faz.
        // Limpa terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Olá, Bem vindo a linguagem java!");
    }
}
