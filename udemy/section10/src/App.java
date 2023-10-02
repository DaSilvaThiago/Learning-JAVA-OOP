import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] m_and_n = new int[2];
        for (int i = 0; i < m_and_n.length; i++) {
            m_and_n[i] = sc.nextInt();
        }
        int[][] mat = new int[m_and_n[0]][m_and_n[1]];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
         for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == x){
                    System.out.println("Position: " + i + ", " + j);
                    if (j-1 >= 0 ) {
                        System.out.println("Left: " + mat[i][j-1]);    
                    }
                    if (j+1 < mat[i].length) {
                        System.out.println("Rigth: " + mat[i][j+1]);    
                    }
                    if (i-1 >= 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i+1 < mat.length) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
                    
                
            }
        }



        sc.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("How many employees will be registered? ");
        int willBe = sc.nextInt();
        System.out.println();
        List<Integer> id = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Double> salary = new ArrayList<>();
        for (int i = 0; i < willBe; i++) {
            System.out.println("Employee #"+(i+1));
            System.out.print("Id: ");
            id.add(i, sc.nextInt());
            sc.nextLine();
            System.out.print("Name: ");
            name.add(i,sc.nextLine());
            System.out.print("Salary: ");
            salary.add(i,sc.nextDouble());
            sc.nextLine();
            System.out.println();
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmployee = sc.nextInt();
        sc.nextLine();
        if(idEmployee >= 1 && idEmployee <= id.size()){
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            int position = id.indexOf(idEmployee);
            double value = salary.get(position);
            salary.set(position, ((value/100)*percent)+value);
            System.out.println("List of employees:");
            for (int i = 0; i < willBe; i++) {
                System.out.println(id.get(i) + ", " + name.get(i) + ", " + salary.get(i));
            }
        }else{
            System.out.println("This id does not exist!");
            System.out.println();
            System.out.println("List of employees:");
            for (int i = 0; i < willBe; i++) {
                System.out.println(id.get(i) + ", " + name.get(i) + ", " + salary.get(i));
            }
        }
        sc.close();*/
    }
}