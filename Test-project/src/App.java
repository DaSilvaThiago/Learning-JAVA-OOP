import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int meteorites, tests=0, coords [] = new int [2], limits_of_farm [] = new int [4];
        while (true) {
            System.out.println("Now type it exactly four coords that delimits your farm. The limits for this are between 1 and 9999. The first X coord need to higher than second X coord and the first Y coord need to Smaller than second Y coord");
            tests++;
            for (int i = 0; i < limits_of_farm.length; i++) {
                limits_of_farm[i] = sc.nextInt();
                if(limits_of_farm[0] < limits_of_farm[2]){
                    System.out.print("The first X coord need to higher than second X coord, try again: ");
                    i--;
                }
                if(limits_of_farm[1] < limits_of_farm[3]){
                    System.out.print("The first Y coord need to Smaller than second Y coord, try again: ");
                    i--;
                }
                /*if (limits_of_farm[i] <= 0 || limits_of_farm[i] >= 9999) {
                        System.out.print("pay attention on the limits, try again: ");
                        i--;
                }*/
            }
            if (limits_of_farm[0] == 0 && limits_of_farm[1] == 0 && limits_of_farm[2] == 0 && limits_of_farm[3] == 0) {
                System.out.println("Final Program, you can see the responses bellow, thank you!");
                break;
            }
            System.out.println("Now we need to know how many meteorites fell in your farm");
            meteorites = sc.nextInt();
            System.out.println("Type the coords where the meteorites is fell");
            for (int i = 1; i <= meteorites; i++) {
                System.out.println("about "+i+"° meteorit");
                for (int j = 0; j < coords.length; j++) {
                    System.out.print((j==0)?("coord X:"):("coord Y:"));
                    coords[j] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < tests; i++) {
            System.out.println("tests");
        }
    }
}





