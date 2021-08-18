    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelista;
import java.util.Scanner;
/**
 *
 * @author mauricio.junior1
 */
public class Testelista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    int[] ListNum = new int[100];
    int a = 0;
    int resp = 0;
    String i = "0";
    System.out.println(" selecione um valor para ser o alvo: ");
    resp = input.nextInt();
    while (!i.equals("n")) {
        System.out.println(" insira um valor para adicionar a lista: ");
        ListNum[a] = input.nextInt();
        System.out.println(" voce deseja continuar a inserir? (y/n) ");
        i = input.next();
        a++;
      }
      System.out.println(" programa finalizado! ");
      for (int c = 0; c< ListNum.length; c++) {
          for (int d = 0; d< ListNum.length; d++) {
              if (ListNum[c] != 0 && ListNum[d] != 0 && ListNum[c] + ListNum[d] == resp ) {
                  System.out.print("" + ListNum[c] + " + " + ListNum[d] + " = ");
                  System.out.println(ListNum[c] + ListNum[d]);
              }
          }
      }
    }
    
    
}
