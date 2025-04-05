public class teste // O nome da classe tem que ser igual ao do arquivo.
{ 
    public static void main(String[] args) {
        // Limpa terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int idade = 20;
        String nome = "Camila";
        System.err.println("Nome: " + nome);
        System.err.println("Idade: " + idade);
    }
}
