import java.util.*;
public class ImprimirSequencia {
  public static void inverte(int n){
    Scanner teclado = new Scanner(System.in);
      if (n == 0){
          return;
      }
      System.out.println("Informe a sequencia numerica: ");
      int sequencia = teclado.nextInt();
      inverte(n-1);
      System.out.println(sequencia);
  }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Informe o tamanho da sequencia numerica: ");
       int tamanho = input.nextInt();
       
       inverte(tamanho);
       
       }
    }