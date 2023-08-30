import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Stack<Integer> meteoritesFromEachFarm = new Stack<Integer>();
        
        //variaveis do scopo geral
        int meteorites, tests=0, out=0, coords [] = new int [2];
        //enquanto o usuario não indicar as coordenadas de saida.
        while (out == 0) {
            //pergunto os limits da fazenda para o usuario e declaro o vetor limites da fazenda.
            System.out.println("Now type it exactly four coords that delimits your farm. The limits for this are between 0 and 10000. The first X coord need to higher than second X coord and the first Y coord need to Smaller than second Y coord");
            int  limits_of_farm [] = new int [4];
            
            //um for para preencher o array area da fazenda e ja verificar se os limits x e y estão de acordo com as restrições e se o usuario quer finalizar a entrada.
            for (int i = 0; i < limits_of_farm.length; i++) {
                limits_of_farm[i] = sc.nextInt();
                if(limits_of_farm[0] < limits_of_farm[2]){
                    System.out.print("The first X coord need to higher than second X coord, try again: ");
                    i--;
                }else if( i==3 && limits_of_farm[1] > limits_of_farm[3]){
                    System.out.print("The first Y coord need to Smaller than second Y coord, try again: ");
                    i--;
                }
                if (limits_of_farm[i] < 0 && limits_of_farm[i] > 10000) {
                        System.out.print("pay attention on the limits, try again: ");
                        i--;
                }
                if(!(limits_of_farm[0] == 0 && limits_of_farm[1] == 0 && limits_of_farm[2] == 0 && limits_of_farm[3] == 0)){
                    out = 0;
                }else{ 
                    out = 1;
                }
            }
            //se o usuario indicar a saida 
            if (out == 1) {
                System.out.println("Final Program! you can see the responses bellow, thank you!");
            //caso o usuario continue, ele ira a seguir dizer a quantidade de meteoritos que cairam na fazenda e digitar as coordenadas x e y de cada meteorito.
            }else{
                int meteoriteInFarm = 0;
                tests++;
                System.out.println("Now we need to know how many meteorites fell in your farm");
                meteorites = sc.nextInt();
                System.out.println("Type the coords where the meteorites is fell");
                for (int i = 1; i <= meteorites; i++) {
                    System.out.println("about "+i+"° meteorit");
                    for (int j = 0; j < coords.length; j++) {
                        System.out.print((j==0)?("coord X:"):("coord Y:"));
                        coords[j] = sc.nextInt();
                    }
                    //aqui faço o calculo para saber se o meteorito está dentro da fazenda, caso sim contabilizo uma soma para saber quantos ao todo cairam na fazendo do teste atual. 
                    if(((limits_of_farm[0] + limits_of_farm[2]) / 2) > coords[0] && ((limits_of_farm[1] + limits_of_farm[3]) / 2) > coords[1]){
                        meteoriteInFarm++;
                    }
                }
                //meteoritesFromEachFarm.push(meteoriteInFarm);
            }
        }
        //mostrar resultado dos testes feitos.
        for (int i = 1; i <= tests; i++) {
            System.out.println("test " + i);
            //System.out.println(meteoritesFromEachFarm[i]);
            
        }
    }
}





