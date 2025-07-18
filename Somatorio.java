import java.util.Scanner;
public class Somatorio {
    Scanner sc = new Scanner(System.in);
    double soma = 0; 
    int n; 
    public void recebevalor(){
        System.out.println("Escreva o valor do n-ésimo termo:");
        n = sc.nextInt();
}
    public void imprimeSequencia(){ 
        for (double i = 1; i <= n; i++) {
            System.out.println("i=" + i );
            soma = soma + 1/i;
            System.out.println(soma);
       }
       }
    public static void main(String[] args) {
        Somatorio som = new Somatorio(); 
        som.recebevalor();
        som.imprimeSequencia();

    }
}
