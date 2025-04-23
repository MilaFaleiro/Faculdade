
import java.util.Stack;

public class pilha {
public static void main (String []args){
    System.out.print("\033[H\033[2J");
    Stack <Integer> Pilha = new Stack <> ();
    Pilha.push (15);
    Pilha.push (12);
    Pilha.push (1);
    Pilha.push (9);
    Pilha.push (10);
    Pilha.push (956);
    Pilha.push (623);
    System.out.println ("Pilha Original "+ Pilha);
int elemento = Pilha.pop ();
System.out.println("\nNúmero retirado: " + elemento);
System.out.println("\nPilha sem o último elemento: " + Pilha);

}
}