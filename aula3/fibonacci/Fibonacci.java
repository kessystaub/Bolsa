/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author 6962246
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */

    static int fibonacci(int n){
        if(n<2){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
    //n=3
    //fibonacci(2) = fibonacci(1)+0 = 1+0 = 1
    //fibonacci(1) = 1
    //fibonnacci(2) + fibonnacci(1) = 2
    
    //n=4
    //fibonacci(3)+fibonacci(2)
    //fibonacci(2) = 1
    //fibonacci(3) = fibonacci(2)+fibonacci(1) = 2
    // fibonacci(3) + fibonnacci(2) = 3
    
    //n=5
    //fibonnacci(4)+fibonnaci(3)
    //3 + 2 = 5
    
    public static void main(String[] args) {
        
        double tempoInicial = System.currentTimeMillis();
        int temp1=0,temp2=1,temp3=1;
        
        for (int i = 0; i < 15; i++){
            System.out.print("(" + i + "):" + temp3 + "\n");
            
            temp3 = temp2 + temp1;
            temp1 = temp2;
            temp2 = temp3;
        }
        double tempoFinal = System.currentTimeMillis();

        
        double tempoInicial2 = System.currentTimeMillis();
        for (int i = 1; i < 15; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibonacci(i) + "\n");
        }
        double tempoFinal2 = System.currentTimeMillis();
        
        System.out.println("o metodo sem recursividade executou em " + (tempoFinal - tempoInicial));
        System.out.println("o metodo com recursividade executou em " + (tempoFinal2 - tempoInicial2));
    }


}
