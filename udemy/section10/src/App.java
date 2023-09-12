import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("How many Peoples will bebeing to typed?");
        int n = sc.nextInt();
        sc.nextLine();
        Peoples[] vect = new Peoples[n];
        int sumMens = 0, sum = 0;
        double lessHeight = 100.0, mostHeight = 0.0, sumHeight = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Type the height of the person "+(i+1)+": ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("Type the gender of the person "+(i+1)+": ");
            char gender = sc.next().charAt(0);
            if(height < lessHeight){
                lessHeight = height;
            }
            if(height > mostHeight){
                mostHeight = height;
            }
            if(gender == 'F'){
                sumHeight += height;
                sum++;
            }
            if(gender == 'M'){
                sumMens ++;
            }
            vect[i] = new Peoples(height, gender);
        }
        System.out.println("Shortest height = " + lessHeight);
        System.out.println("Most height = " + mostHeight);
        System.out.println("Avarage of the heights of womans = %.2f%n" + sumHeight/sum);
        System.out.println("Number of mens = "+ sumMens);

        sc.close();
    }
}
