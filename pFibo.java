import java.util.Scanner;

public class pFibo {
    int n;
    public void enesimo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos da série Primo do Fibonacci: ");
         n = sc.nextInt(); 
    }

    public void imprimeseq(){
        int a = 1, b = 1, c = 1, d = 1, e;
        System.out.print(a + " " + b + " " + c + " " + d + " ");
        for (int i = 3; i <= n; i++) {
            
            e = a + b + c + d;
            System.out.print(e + " ");
            a = b;
            b = c;
            c = d; 
            d = e; 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        pFibo pf = new pFibo();
        pf.enesimo();
        pf.imprimeseq();
    }
}