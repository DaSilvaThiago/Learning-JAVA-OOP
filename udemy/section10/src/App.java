import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student[] StudentRent = new Student[10];
        int n = 0;
        do {
            System.out.println("How many students will being to rent a room? (1-10)");
            n = sc.nextInt();            
            sc.nextLine();
        } while (n < 1 || n > 10);
        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #"+i);
            System.out.print("What's your name: ");
            String name = sc.nextLine();
            System.out.print("What's your email address: ");
            String email = sc.nextLine();
            System.out.print("Available rooms: ");
            for (int j = 0; j < StudentRent.length; j++) {             
                if (StudentRent[j] == null) {
                    System.out.print(" | "+ j +" | ");
                }
            }  
            System.out.println();
            System.out.print("room: ");
            int ChosedRoom = sc.nextInt();
            sc.nextLine();
            StudentRent[ChosedRoom] = new Student(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < StudentRent.length; i++) {
            if (StudentRent[i] != null) {
                System.out.println(i+": "+StudentRent[i].getName()+", "+StudentRent[i].getEmail());
            }
        }
             


        sc.close();
    }
}
//after i can try to make an program that list free rooms and according to user choose an room, this room disappear to the list