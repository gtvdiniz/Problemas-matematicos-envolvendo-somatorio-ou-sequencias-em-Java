import java.util.Scanner;
public class Sequencia {
    Scanner sc = new Scanner(System.in);
    private int escolha; 
    private int n; 

    public void escolheprogressao(){
        System.out.println("Escolha a progressão: \n[1] - Aritmérica\n [2] - Geométrica");
        this.escolha = sc.nextInt(); 
    }
    public void setN(){
        System.out.print("Digite n-ésimo termo da sequência: ");
        this.n = sc.nextInt();
    }

    public void imprimirProgressao(){
        switch (this.escolha) {
            case 1:
                {
                    System.out.println("Informe o primeiro termo: ");
                    int a = sc.nextInt();
                    System.out.println("\nInforme a razão da sequência: ");
                    int r = sc.nextInt();
                    int b;
                    System.out.print(a + " ");
                    for (int i = 2; i <= n; i++) {
                        
                        b = a + r;
                        System.out.print(b + " ");
                        a = b;
                    }           System.out.println();
                    break;
                }
            case 2:
                {
                    System.out.println("Informe o primeiro termo: ");
                    int a = sc.nextInt();
                    System.out.println("\nInforme a razão da sequência: ");
                    int r = sc.nextInt();
                    int b;
                    System.out.print(a + " ");
                    for (int i = 2; i <= n; i++) {
                        
                        b = a * r;
                        System.out.print(b + " ");
                        a = b;
                    }           System.out.println();
                    break;
                }
            default:
                System.out.println("Inválido");
                break;
        }
    }
    public static void main(String[] args) {
        Sequencia seq = new Sequencia();
        seq.escolheprogressao();
        seq.imprimirProgressao();
    }
    
}
