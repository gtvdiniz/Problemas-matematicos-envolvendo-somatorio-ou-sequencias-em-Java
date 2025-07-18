import java.util.Scanner;

public class SequenciaGeometrica {
    private int n;
    Scanner sc = new Scanner(System.in);
    public void enesimo(){
        
    }
    public void setN(){
        System.out.print("Digite n-ésimo termo da sequência: ");
        this.n = sc.nextInt();
    }

    public void imprimeProgressao(){
        System.out.println("Informe o primeiro termo: ");
        int a = sc.nextInt();

        System.out.println("\nInforme a razão da sequência: ");
        int r = sc.nextInt();
        int b;

        System.out.print(a + " ");
        for (int i = 2; i <= n; i++) {

            b = a *r; 
            System.out.print(b + " ");
            a = b;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SequenciaGeometrica pg = new SequenciaGeometrica();
        pg.setN();
        pg.enesimo();
        pg.imprimeProgressao();
    }
}

